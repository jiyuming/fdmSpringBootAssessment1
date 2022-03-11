package com.fdmgroup.app.data;


import org.springframework.data.jpa.repository.JpaRepository;

import com.fdmgroup.app.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
