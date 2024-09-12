package com.example.social.controller;

import com.example.social.entities.User;
import com.example.social.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    UserRepository userRepository;

    // PFV N USAR ESSE ENDPOINT, N TA FUNFANDO.
    //todo: fazer funfar :D
    @GetMapping("/users")
    public String findAllUser(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("allUsers", users);
        return "users";
    }



}
