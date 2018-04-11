package com.rest.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestSecurityController {

	public RestSecurityController() {
		// TODO Auto-generated constructor stub
	}
	@GetMapping("/get/data")
	public String getData()
	{
		return "success";
	}

}
