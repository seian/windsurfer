package org.windsurfer.search.ocean.WebDebugger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public abstract class WebPageBaseImpl implements WebPageBase {
	public abstract String viewer();

	protected String LoadHtml(String resourceFile) {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream stream = classLoader.getResourceAsStream("html/" + resourceFile);
		BufferedReader br = new BufferedReader(new InputStreamReader(stream));
		String line;
		StringBuilder sb = new StringBuilder();
		try {
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
			return sb.toString();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
}
