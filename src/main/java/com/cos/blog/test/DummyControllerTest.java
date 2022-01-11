package com.cos.blog.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.model.User;
import com.cos.blog.repository.UserRepository;


@RestController
public class DummyControllerTest {

	@Autowired // 의존성 주입 
	private UserRepository userRepository;
	
	@PostMapping("/dummy/join")
	public String join(User user) {
		userRepository.save(user);
		return "회원가입 완료";
	}
	
	


}
