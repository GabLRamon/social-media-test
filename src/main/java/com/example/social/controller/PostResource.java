package com.example.social.controller;

import com.example.social.entities.Post;
import com.example.social.mappers.PostMapper;
import com.example.social.repository.PostRepository;
import com.example.social.serializables.PostRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/api")
public class PostResource {

    @Autowired
    PostRepository postRepository;

    PostMapper postMapper;

    @GetMapping("/posts")
    public ResponseEntity<List<PostRecord>> getAllPosts() {

        List<PostRecord> postRecords = postRepository.findAll().stream().map(postMapper::toRecord).toList();

        return ResponseEntity.ok(postRecords);
    }




}
