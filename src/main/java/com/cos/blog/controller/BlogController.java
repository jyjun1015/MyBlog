package com.cos.blog.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class BlogController {

	@GetMapping({"","/"})
	public String index() {
		return "index";
	}
	@RequestMapping(value = "/api/test", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public String getApiTest() {
		return "{\"result\":\"ok\"}";
	}

}
