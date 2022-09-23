package com.example.springStudy;

import com.example.springStudy.domain.User;
import com.example.springStudy.repository.UserRepository;
import com.example.springStudy.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class SpringStudyApplicationTests {
	private UserRepository userRepository= new UserRepository();
	private UserService userService = new UserService();


	@Test
	void join(){
		User user = new User();
		user.setEmail("test");
		user.setName("test1234");
		user.setPassword("aaaa");
		userService.join(user);

		User result = userService.searchUser("test").get();
		Assertions.assertEquals(result, user);
	}


}
