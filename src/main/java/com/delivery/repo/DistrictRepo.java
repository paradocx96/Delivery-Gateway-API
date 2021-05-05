package com.delivery.repo;

import com.delivery.model.District;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistrictRepo extends JpaRepository<District,Integer> {
}
