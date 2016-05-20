package com.jrestful.cms.config;

public enum ApiConfig {

	API_VERSION("V1.0.0"), SUCCESS_CODE("SUCCESS"), HTTP_404_CODE("404"), HTTP_404_MESSAGE("Request path not found");

	private String value;

	public String getValue() {
		return value;
	}

	private ApiConfig(String value) {
		this.value = value;
	}

}
