package com.testplus.testplus;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestplusApplicationTests {


	@Autowired
	private TextService textService;

	@Test
	void contextLoads() {
		textService.someMethod();
	}

}
