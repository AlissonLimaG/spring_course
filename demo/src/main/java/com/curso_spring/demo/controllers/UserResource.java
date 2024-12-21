package com.curso_spring.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso_spring.demo.entities.User;

@RestController
@RequestMapping("/users")
public class UserResource {
    

    @GetMapping("/")
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Maria", "4Y0Qx@example.com", "999999999", "123456");
        return ResponseEntity.ok().body(u);
    }

}
