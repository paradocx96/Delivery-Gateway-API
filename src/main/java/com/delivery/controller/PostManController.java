package com.delivery.controller;

import com.delivery.model.PostMan;
import com.delivery.repo.PostManRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PostManController {

    @Autowired
    PostManRepo repo;

    public void createUpdatePostMan(PostMan postMan) {
        repo.save(postMan);
    }

    public List<PostMan> getAllPostMan() {
        return (List<PostMan>) repo.findAll();
    }

    public void deletePostManById(int id) {
        repo.deleteById(id);
    }

    public PostMan getPostManById(int id) {
        return repo.findById(id).get();
    }

}
