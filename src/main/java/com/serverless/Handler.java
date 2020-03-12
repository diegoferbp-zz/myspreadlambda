package com.serverless;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.serverless.model.range.Range;
import org.apache.log4j.Logger;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Handler implements RequestHandler<Map<String, Object>, Response> {

	private static final Logger LOG = Logger.getLogger(Handler.class);
	private static final int MAX_RANGE_SIZE = 100;
	private static final int MAX_RANGES = 10;

	@Override
	public Response handleRequest(Map<String, Object> input, Context context) {
		LOG.info("received: " + input);
		List<Range> rangeList = generateRandomRanges();
		Response responseBody = new Response("Go Serverless v1.x! Your function executed successfully!", rangeList);
		return responseBody;
	}

	private List<Range> generateRandomRanges() {
		List<Range> rangeList = new ArrayList<>();
		Integer rangeSize = (int)Math.ceil(Math.random() * MAX_RANGE_SIZE);
		Integer ranges = (int)Math.ceil(Math.random() * MAX_RANGES);
		for(int i = 0; i < ranges; i++){
			rangeList.add(new Range.Builder().from((i*rangeSize)+1 ).to((i+1)*rangeSize).build());
		}
		return rangeList;
	}
}
