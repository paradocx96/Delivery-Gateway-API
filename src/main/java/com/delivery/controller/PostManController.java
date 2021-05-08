package com.delivery.controller;

import com.delivery.model.PostMan;
import com.delivery.service.PostManService;

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
@RequestMapping("/api/postman")
public class PostManController {

    @Autowired
    PostManService service;

    @PostMapping
    public PostMan createUpdatePostMan(@RequestBody PostMan pm) {
    	return service.savePostMan(pm);
    }

    @GetMapping
    public List<PostMan> getAllPostMan() {
        return service.findAllPostMan();
    }

    @GetMapping("/{id}")
    public PostMan getPostManById(@PathVariable("id") int id) {
        return service.getPostManId(id);
    }
        
    @PutMapping("/{id}")
    public PostMan updatePostManById(@RequestBody PostMan pm, @PathVariable("id") int id) {    	
    	return service.updatePostManId(pm, id);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<PostMan> deletePostManById(@PathVariable("id") int id) {
    	return service.deletePostManId(id);
    }

}
