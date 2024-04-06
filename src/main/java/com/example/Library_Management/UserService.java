package com.example.Library_Management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRep userepo;

    public User registerUser(User user) {
        if (userepo.findByUsername(user.getUsername()) != null) {
            throw new RuntimeException("User already exists");
        }
        return userepo.save(user);
    }

    public User loginuser(String username, String password) {
        User user = userepo.findByUsername(username);
        if (user == null) {
            throw new RuntimeException("User does not exist");
        }
        // Add password hashing and validation logic here
        // For example:
        // if (!passwordEncoder.matches(password, user.getPassword())) {
        //     throw new RuntimeException("Password doesn't match");
        // }
        if (!password.equals(user.getPassword())) {
            throw new RuntimeException("Password doesn't match");
        }
        return user;
    }
}

