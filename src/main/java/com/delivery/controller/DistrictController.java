package com.delivery.controller;

import com.delivery.model.District;
import com.delivery.repo.DistrictRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class DistrictController {

    @Autowired
    DistrictRepo repo;

    public void createUpdateDistrict(District district) {
        repo.save(district);
    }

    public List<District> getAllDistrict() {
        return (List<District>) repo.findAll();
    }

    public void deleteDistrictById(int id) {
        repo.deleteById(id);
    }

    public District getDistrictById(int id) {
        return repo.findById(id).get();
    }
}
