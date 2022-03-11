package com.fdmgroup.app.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.Mockito.*;

import com.fdmgroup.app.data.AddressRepository;

@SpringBootTest
@AutoConfigureMockMvc
class AddressServiceTests {

	AddressRepository addressRepo;
	
	@BeforeEach
	void setUp() {
		addressRepo = mock(AddressRepository.class);
	}
	
	
}
