package com.cos.blog.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("api/user")
	public ResponseDto<> save(){
	}

}
