package com.spring.user.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {

	@DisplayName("[두 회원의 이름이 같다.]")
	@Test
	void TwoUserIsSameName() {
	    // given
		User 철수 = new User("철수");
		User 영희 = new User("영희");

		// when		// then
		Assertions.assertEquals(철수.getName(), 영희.getName());
	}
}
