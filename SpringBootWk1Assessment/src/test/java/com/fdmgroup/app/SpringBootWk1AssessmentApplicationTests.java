package com.fdmgroup.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class SpringBootWk1AssessmentApplicationTests {

	@Autowired
	MockMvc mvc;

	@Test
	public void test_getHomePage_sendsToLoginView() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/login")).andExpect(MockMvcResultMatchers.view().name("login"));
	}

//	@Test
//	public void test_post_processAddEmployee_redirectsToHomeUsingGoodCredentials() throws Exception {
//		mvc.perform(MockMvcRequestBuilders.post("/login").param("username", "yji"))
//				.andExpect(MockMvcResultMatchers.redirectedUrl("/home"));
//
//	}

}
