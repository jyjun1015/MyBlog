package com.cos.blog.controller.api;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BoardController {

	@GetMapping({"","/"})
	public String index() {
		return "/indexs";
	}
	@RequestMapping(value = "/api/test", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public String getApiTest() {
		return "{\"result\":\"ok\"}";
	}
	
//	@RequestMapping(value="/test")
//	   public String indexs() {
//	       return "indexs";
//	   }

}
