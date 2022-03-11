package com.fdmgroup.app.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdmgroup.app.model.Address;
import com.fdmgroup.app.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	void addEmployee(Employee employee, Address address);

	List<Employee> findAllById(int id);
	
}
