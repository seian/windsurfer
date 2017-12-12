package org.windsurfer.search.ocean;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import org.junit.Test;

import javax.annotation.Nullable;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class TestOceanClient {

	private String localhost = "localhost:8888";

	@Test
	public void testOceanConnection() {
		try {
			OceanClient oceanClient = new OceanClient(localhost);
			OceanRequest req = OceanRequest.newBuilder().setQuery("test").build();
			ListenableFuture<OceanResponse> response = oceanClient.search(req);
			Futures.addCallback(response, new FutureCallback<OceanResponse>() {
				@Override
				public void onSuccess(@Nullable OceanResponse result) {
					System.out.println(result.getResponse());
					assertEquals("test", result.getResponse());
				}

				@Override
				public void onFailure(Throwable t) {

				}
			});
			TimeUnit.SECONDS.sleep(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}