package com.delivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.delivery.exception.NotFoundException;
import com.delivery.model.Address;
import com.delivery.repo.AddressRepo;

@Service
public class AddressService {
	
	@Autowired
	AddressRepo addressRepo;
	
	public Address saveAddress(Address address) {
		return addressRepo.save(address);
	}

	public List<Address> findAllAddress() {
		return addressRepo.findAll();
	}

	public Address getAddressId(int id) {
		return addressRepo.findById(id).orElseThrow(()-> new NotFoundException("Address Not Found ID : " + id));
	}
	
	public List<Address> getAddressUid(int userid) {
		return addressRepo.findByByUserid(userid);
	}
	
	public Address updateAddressId(Address address, int id) {
		Address exist = addressRepo.findById(id).orElseThrow(() -> new NotFoundException("Address Not Found ID :" + id));
    	exist.setAddresss(address.getAddresss());
    	exist.setProvince(address.getProvince());
    	exist.setDistrict(address.getDistrict());
    	exist.setCity(address.getCity());
    	exist.setPhone(address.getPhone());
    	exist.setTitle(address.getTitle());
    	exist.setZip(address.getZip());
		return addressRepo.save(exist);
	}
	
	public ResponseEntity<Address> deleteAddressId(int id){
		Address exist = addressRepo.findById(id).orElseThrow(() -> new NotFoundException("Address Not Found ID :" + id));
    	addressRepo.delete(exist);
		return ResponseEntity.ok().build();
	}

}
