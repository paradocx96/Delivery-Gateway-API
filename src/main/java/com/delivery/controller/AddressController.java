package com.delivery.controller;

import com.delivery.model.Address;
import com.delivery.service.AddressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders = "*")
@RestController
@RequestMapping("/api/address")
public class AddressController {

	@Autowired
	AddressService service;

	@PostMapping
	public Address createUpdateAddress(@RequestBody Address address) {
		return service.saveAddress(address);
	}

	@GetMapping
	public List<Address> getAllAddress() {
		return service.findAllAddress();
	}

	@GetMapping("/{id}")
	public Address getAddressById(@PathVariable("id") int id) {
		return service.getAddressId(id);
	}

	@PutMapping("/{id}")
	public Address updateAddressById(@RequestBody Address address, @PathVariable("id") int id) {
		return service.updateAddressId(address, id);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Address> deleteAddressById(@PathVariable("id") int id) {
		return service.deleteAddressId(id);
	}

	@GetMapping("/user/{userid}")
	public List<Address> getAddressByUserid(@PathVariable("userid") int userid) {
		return service.getAddressUid(userid);
	}
}
