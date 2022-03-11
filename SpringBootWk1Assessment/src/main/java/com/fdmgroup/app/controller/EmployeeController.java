package com.fdmgroup.app.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fdmgroup.app.model.Address;
import com.fdmgroup.app.model.Employee;
import com.fdmgroup.app.service.AddressService;
import com.fdmgroup.app.service.EmployeeService;

@Controller
public class EmployeeController {
	private EmployeeService empService;
	private AddressService addressService;

	@Autowired
	public EmployeeController(EmployeeService empService, AddressService addressService) {
		super();
		this.empService = empService;
		this.addressService = addressService;
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		List<Address> addresses = addressService.getAllAddresses();
		model.addAttribute("addresses", addresses);
		return "home";
	}
	
	@PostMapping("/addEmployee")
	public String processAddEmployee(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String hireDate, @RequestParam String addrId) {
		Optional<Address> addr = addressService.findById(Integer.valueOf(addrId));
		Employee emp = new Employee(firstName, lastName, hireDate, addr.get());
		empService.addEmployee(emp);
		return "redirect:/home";
	}
	
	@GetMapping("/search")
	public String processsearchByAddress(@RequestParam int id, Model model) {
		List<Employee> emps = empService.searchEmployeesByAddressId(id);
		model.addAttribute("emps", emps);
		return "showEmployees";
	}
	
	
}
