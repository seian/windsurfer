package org.windsurfer.search.ocean;

import com.google.common.collect.ImmutableMap;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.windsurfer.search.ocean.WebDebugger.WebPageBase;
import org.windsurfer.search.ocean.WebDebugger.WebPageRoot;
import org.windsurfer.search.ocean.WebDebugger.WebPageSystem;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

public class OceanWebDebugger implements HttpHandler {
	private static Logger logger = LogManager.getLogger();
	private static Map<OceanWebHandlerEnum, WebPageBase> pages =
			ImmutableMap.<OceanWebHandlerEnum, WebPageBase>builder()
					.put(OceanWebHandlerEnum.ROOT, new WebPageRoot())
					.put(OceanWebHandlerEnum.SYS, new WebPageSystem())
					.build();

	@Override
	public void handle(HttpExchange httpExchange) throws IOException {
		String path = httpExchange.getRequestURI().getPath();
		logger.info(String.format("Requested handler: %s", path));
		WebPageBase webPage = new WebPageRoot();
		for(OceanWebHandlerEnum handler : OceanWebHandlerEnum.values()) {
			if(path.equals(handler.getValue())) {
				webPage = pages.get(handler);
				break;
			}
		}
		String response = webPage.viewer();
		byte[] bytes = response.getBytes("UTF-8");
		httpExchange.getResponseHeaders().set("Content-Type", "text/html; charset=utf-8");
		httpExchange.sendResponseHeaders(200, bytes.length);
		OutputStream os = httpExchange.getResponseBody();
		os.write(bytes);
		os.close();
	}
}
