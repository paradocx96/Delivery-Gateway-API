package com.delivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.delivery.exception.NotFoundException;
import com.delivery.model.PostMan;
import com.delivery.repo.PostManRepo;

@Service
public class PostManService {
	
	@Autowired
	PostManRepo postManRepo;

	public PostMan savePostMan(PostMan pm) {
		return postManRepo.save(pm);
	}

	public List<PostMan> findAllPostMan() {
		return postManRepo.findAll();
	}

	public PostMan getPostManId(int id) {
		return postManRepo.findById(id).orElseThrow(()-> new NotFoundException("PostMan Not Found ID : " + id));
	}

	public PostMan updatePostManId(PostMan pm, int id) {
		PostMan exist = postManRepo.findById(id).orElseThrow(() -> new NotFoundException("PostMan Not Found ID :" + id));
		exist.setDate(pm.getDate());
		exist.setOrderid(pm.getOrderid());
		exist.setAddress(pm.getAddress());
		exist.setType(pm.getType());
		exist.setPrice(pm.getPrice());
		exist.setStatus(pm.getStatus());
		return postManRepo.save(exist);
	}

	public ResponseEntity<PostMan> deletePostManId(int id) {
		PostMan exist = postManRepo.findById(id).orElseThrow(() -> new NotFoundException("PostMan Not Found ID :" + id));
		postManRepo.delete(exist);
		return ResponseEntity.ok().build();
	}

}
