package org.windsurfer.search.ocean;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class OceanClient {
	private String ip;
	private int port;
	OceanServiceGrpc.OceanServiceFutureStub futureStub;

	public OceanClient(String host) throws Exception {
		if(!host.contains(":")) {
			throw new Exception("Host Information Invalid.");
		}

		ip = host.split(":")[0];
		port = Integer.parseInt(host.split(":")[1]);

		ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(ip, port).build();
		futureStub = OceanServiceGrpc.newFutureStub(managedChannel);
	}

	public ListenableFuture<OceanResponse> search(OceanRequest req) {
		return futureStub.search(req);
	}
}
