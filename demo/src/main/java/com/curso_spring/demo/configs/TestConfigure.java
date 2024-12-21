package com.curso_spring.demo.configs;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.curso_spring.demo.entities.User;
import com.curso_spring.demo.repositories.UserRepositoy;

@Configuration
@Profile("test")
public class TestConfigure implements CommandLineRunner{
    
    @Autowired
    private UserRepositoy userRepositoy;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria", "4Y0Qx@example.com", "999999999", "123456");
        User u2 = new User(null, "Joao", "4Y0Qx@example.com", "999999999", "123456");

        userRepositoy.saveAll(Arrays.asList(u1,u2));
    }
}
