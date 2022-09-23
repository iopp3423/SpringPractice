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
	@Test
	void 이메일로유저찾기(){
		User user = new User();
		user.setEmail("test");
		user.setName("test1234");
		user.setPassword("aaaa");
		userService.join(user);

		User result = userService.searchUser("test").get();
	}
	@Test
	void 비밀번호찾기(){
		User user = new User();
		user.setEmail("test");
		user.setName("test1234");
		user.setPassword("aaaa");
		userService.join(user);

		String result = userService.findPassword("test");
		Assertions.assertEquals(result, "aaaa");
	}
	@Test
	void 전체회원조회(){
		User user = new User();
		user.setEmail("test");
		user.setName("test1234");
		user.setPassword("aaaa");
		userService.join(user);

		User user2 = new User();
		user2.setEmail("test2");
		user2.setName("test12345");
		user2.setPassword("aaaab");
		userService.join(user2);

		List<User> result = userService.findAllUser();
		Assertions.assertEquals(result.size(), 2);
	}


}
