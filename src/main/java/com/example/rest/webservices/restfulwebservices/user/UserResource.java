package com.example.rest.webservices.restfulwebservices.user;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    private final UserDaoService userDaoService;

    @Autowired
    public UserResource(UserDaoService userDaoService){
        this.userDaoService = userDaoService;
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userDaoService.findAllUsers();
    }

    @GetMapping("/users/id/{id}")
    public User getUserById(@PathVariable Integer id){
        User user = userDaoService.findUserById(id);
        if( user == null)
            throw new UserNotFoundException("User with id " + id + " not found");

        return user;
    }

    @PostMapping("/users")
    public ResponseEntity<User> AddUser(@RequestBody User user){
        User userResult = userDaoService.saveUser(user);
        return new ResponseEntity<>(userResult, HttpStatus.CREATED);
        // URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/id/{id}").buildAndExpand(userResult.getId()).toUri();
        // return ResponseEntity.created(location).build();
    }
}
