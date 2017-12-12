package org.windsurfer.search.ocean;

public enum OceanWebHandlerEnum {
	ROOT("/"),
	SYS("/sys");

	private String val;
	OceanWebHandlerEnum(String val) {
		this.val = val;
	}

	public String getValue() {
		return val;
	}
}
