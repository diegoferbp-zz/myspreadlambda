package com.serverless;

import java.util.Map;

public class Response {

	private final String message;

	public Object getInput() {
		return input;
	}

	private final Object input;

	public Response(String message, Object input) {
		this.message = message;
		this.input = input;
	}

	public String getMessage() {
		return this.message;
	}

}
