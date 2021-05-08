package com.delivery.repo;

import com.delivery.model.Address;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AddressRepo extends JpaRepository<Address,Integer> {
	
	@Query("SELECT a FROM Address a WHERE LOWER(a.userid) = LOWER(:userid)")
	List<Address> findByByUserid(@Param("userid") int userid);
}
