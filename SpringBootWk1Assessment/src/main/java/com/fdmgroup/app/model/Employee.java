package com.fdmgroup.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "ASS_USER")
//Implement the same functionality without the List of Employees in the Address class. 
//(Hint) You will need JPQL to accomplish this task.
//@NamedQueries({
//	@NamedQuery(name = "Employee.findByAddress", query = "SELECT e FROM Employee e WHERE e.Address. LIKE ?1") })
public class Employee {
	
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int id;
	private String  firstName;
	private String lastName;
	private String hireDate;
	
	@ManyToOne
	@JoinColumn(name="address_id_fk", nullable = false)
	private Address address;
//	private int address_id;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName, String hireDate, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.hireDate = hireDate;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", hireDate=" + hireDate
				+ "]";
	}
	
}
