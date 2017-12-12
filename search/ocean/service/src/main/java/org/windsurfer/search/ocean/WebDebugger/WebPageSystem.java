package org.windsurfer.search.ocean.WebDebugger;

public class WebPageSystem implements WebPageBase {
	public String getSystemInfo() {
		StringBuilder html = new StringBuilder();
		html.append("<h1>System Status -WindSurfer</h1>");
		return html.toString();
	}

	@Override
	public String viewer() {
		StringBuilder html = new StringBuilder();
		html.append("<html>");
		html.append("<head>");
		html.append("</head>");
		html.append("<body>");

		html.append(getSystemInfo());

		html.append("</body>");
		html.append("</html>");
		return html.toString();
	}
}
