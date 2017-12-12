package org.windsurfer.search.ocean;

import com.sun.net.httpserver.HttpServer;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class OceanService extends OceanServiceGrpc.OceanServiceImplBase {
	private static final Logger logger = LogManager.getLogger();
	private static int httpPort = 8080;
	private static int port = 8888;

	protected Server server;

	private void initialize() throws IOException {
		startHttpServer();
	}

	private void start() throws IOException, InterruptedException {
		logger.info(String.format("Starting Ocean Server on port : %s", port));
		server = ServerBuilder.forPort(port).addService(this).build().start();
		if(server != null) {
			server.awaitTermination();
		}
	}

	private void startHttpServer() throws IOException {
		logger.info("Starting Http Server.");
		HttpServer httpServer = HttpServer.create(new InetSocketAddress(httpPort), 0);
		httpServer.setExecutor(Executors.newFixedThreadPool(5));
		OceanWebDebugger searchWebDebugger = new OceanWebDebugger();
		for(OceanWebHandlerEnum handler : OceanWebHandlerEnum.values()) {
			logger.info(String.format("Creating HTTP Context for %s", handler.getValue()));
			httpServer.createContext(handler.getValue(), searchWebDebugger);
		}
		httpServer.start();
	}

	@Override
	public void search(OceanRequest request, StreamObserver<OceanResponse> responseObserver) {
		String req = request.getQuery();
		OceanResponse res = OceanResponse.newBuilder().setResponse(req).build();
		responseObserver.onNext(res);
		responseObserver.onCompleted();
	}

	public static void main(String[] args) throws Exception {
		OceanService oceanService = new OceanService();
		oceanService.initialize();
		oceanService.start();

	}
}
