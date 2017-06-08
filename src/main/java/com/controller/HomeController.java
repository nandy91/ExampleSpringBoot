package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.SampleService;

/**
 * @author NANDITHA Controller class using Externalizing configurations
 */
@RestController
public class HomeController {

	// Service class
	private SampleService s;

	@Autowired
	public HomeController(SampleService s) {
		this.s = s;
	}

	// @Value used to get properties defined in application.properties or
	// application.yml
	@Value("${welcome.msg}")
	private String welcome_msg;

	@RequestMapping("/")
	public String welcome() {

		return welcome_msg;
	}

	@RequestMapping("/hello")
	public String servicewelcome() {

		return s.serviceMsg();
	}

}
