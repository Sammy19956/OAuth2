package com.example.oauth2demo.Entity;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class Controller {

    private final UserRepository userRepository;

    @PostMapping("/register")
    public User register(User user) {
        return userRepository.save(user);
    }
}
