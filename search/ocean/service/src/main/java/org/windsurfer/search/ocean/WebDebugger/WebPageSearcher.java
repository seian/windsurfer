package org.windsurfer.search.ocean.WebDebugger;

public class WebPageSearcher extends WebPageBaseImpl {
	@Override
	public String viewer() {
		return this.LoadHtml("searcher.html");
	}
}
