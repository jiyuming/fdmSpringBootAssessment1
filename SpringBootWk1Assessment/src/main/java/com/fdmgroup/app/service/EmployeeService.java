package com.fdmgroup.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.app.data.EmployeeRepository;
import com.fdmgroup.app.model.Address;
import com.fdmgroup.app.model.Employee;

@Service
public class EmployeeService {
	EmployeeRepository empRepo;

	@Autowired
	public EmployeeService(EmployeeRepository empRepo) {
		super();
		this.empRepo = empRepo;
	}

	public void addEmployee(Employee employee) {
		empRepo.save(employee);
	}

//	public List<Employee> searchEmployeesByAddress(Address address) {
//		List<Employee> emps = empRepo.findByAddress(address.getStreet(), address.getCity(), address.getZipCode(),
//				address.getState(), address.getCity());
//		return emps;
//	}

	public List<Employee> searchEmployeesByAddressId(int id) {
		List<Employee> list = empRepo.findAllById(id);
		return list;
	}
}
