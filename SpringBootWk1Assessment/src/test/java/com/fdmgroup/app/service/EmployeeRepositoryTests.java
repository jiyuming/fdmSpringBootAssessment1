package com.fdmgroup.app.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fdmgroup.app.data.AddressRepository;
import com.fdmgroup.app.data.EmployeeRepository;

class EmployeeRepositoryTests {

	EmployeeRepository empRepo;
	
	@BeforeEach
	void setUp() throws Exception {
		empRepo = mock(EmployeeRepository.class);
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
