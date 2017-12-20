package org.windsurfer.search.ocean.WebDebugger;

public class WebPageRoot extends WebPageBaseImpl {
	@Override
	public String viewer() {
		StringBuilder html = new StringBuilder();
		html.append("<html><h1>WindSurfer!</h1></html>");
		return html.toString();
	}
}
