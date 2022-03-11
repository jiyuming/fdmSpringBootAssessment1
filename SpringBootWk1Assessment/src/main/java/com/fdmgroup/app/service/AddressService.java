package com.fdmgroup.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.app.data.AddressRepository;
import com.fdmgroup.app.data.EmployeeRepository;
import com.fdmgroup.app.model.Address;
import com.fdmgroup.app.model.Employee;

@Service
public class AddressService {
	private AddressRepository addressRepo;

	@Autowired
	public AddressService(AddressRepository addressRepo) {
		super();
		this.addressRepo = addressRepo;
	}

	public List<Address> getAllAddresses() {
		return addressRepo.findAll();
	}

	public Optional<Address> findById(int addressId) {
		return addressRepo.findById(addressId);
	}
	
}
