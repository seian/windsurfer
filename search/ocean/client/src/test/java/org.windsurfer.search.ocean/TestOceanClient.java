package org.windsurfer.search.ocean;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import org.junit.Test;

import javax.annotation.Nullable;

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
					System.out.println(1);
					System.out.println(result.getResponse());
				}

				@Override
				public void onFailure(Throwable t) {

				}
			});
			while(true) {

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}