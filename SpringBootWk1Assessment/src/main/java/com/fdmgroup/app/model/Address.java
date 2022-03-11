package com.fdmgroup.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ASS_ADDRESS")
public class Address {

	@Id
	@GeneratedValue
	@Column(name = "address_id")
	private int id;
	private String street;
	private String city;
	private String zipCode;
	private String state;
	private String country;
	@OneToMany(mappedBy = "address")
	private List<Employee> employees = new ArrayList<>();

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String city, String zipCode, String state, String country, List<Employee> employees) {
//	public Address(String street, String city, String zipCode, String state, String country) {
	super();
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
		this.country = country;
		this.employees = employees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", zipCode=" + zipCode + ", state="
				+ state + ", country=" + country + "]";
	}

}
