package com.delivery.controller;

import com.delivery.model.Address;
import com.delivery.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AddressController {

    @Autowired
    AddressRepo repo;

    public void createUpdate(Address address) {
        repo.save(address);
    }

    public List<Address> getAllAddress() {
        return (List<Address>) repo.findAll();
    }

    public void deleteAddressById(int id) {
        repo.deleteById(id);
    }

    public Address getAddressById(int id) {
        return repo.findById(id).get();
    }
}
