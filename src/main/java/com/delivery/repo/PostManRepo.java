package com.delivery.repo;

import com.delivery.model.PostMan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostManRepo extends JpaRepository<PostMan, Integer> {
}
