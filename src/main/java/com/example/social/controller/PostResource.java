package com.example.social.controller;

import com.example.social.entities.Post;
import com.example.social.mappers.PostMapper;
import com.example.social.repository.PostRepository;
import com.example.social.serializables.PostRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api")
public class PostResource {

    @Autowired
    PostRepository postRepository;

    PostMapper postMapper;

    @GetMapping("/posts")
    public ResponseEntity<List<Post>> getAllPosts() {

        List<Post> postRecords = postRepository.findAll();

        return ResponseEntity.ok(postRecords);
    }

    @GetMapping("/posts/{id}")
    public ResponseEntity<Post> getAllPosts(@PathVariable Long id) throws Exception {

        Post post;

        Optional<Post> postOpt = postRepository.findById(id);

        if (postOpt.isPresent()) {
            post = postOpt.get();
        } else {
            throw new Exception("O id está invalido!");
        }

        return ResponseEntity.ok(post);
    }




}
