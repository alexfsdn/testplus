package com.testplus.testplus;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {TextService.class})//essa configuração diferente da anotação @SpringBootTeste
	//inicia um contexto reduzido e inicia apenas as classes da aplicação que foram passadas como parâmetros
class TestplusApplicationContextConfigurationTests {


	@Autowired
	private TextService textService;

	@Test
	void contextLoads() {
		textService.someMethod();
	}

}
