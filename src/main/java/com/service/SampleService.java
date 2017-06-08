package com.service;

import org.springframework.stereotype.Service;

/**
 * @author NANDITHA
 *
 */
@Service
public class SampleService {

	public SampleService() {

	}

	public String serviceMsg() {

		return "Message from Service";
	}

	@Override
	public String toString() {
		return "SampleService";
	}

}
