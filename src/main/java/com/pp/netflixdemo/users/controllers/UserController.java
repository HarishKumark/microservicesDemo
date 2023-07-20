/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pp.netflixdemo.users.controllers;

import com.pp.netflixdemo.users.entites.UserDetails;
import com.pp.netflixdemo.users.service.UserService;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hkorada
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    private Logger log = LoggerFactory.getLogger(UserController.class);

    @PostMapping
    public ResponseEntity<UserDetails> createUser(@RequestBody UserDetails userDetails) {
        log.info("In createUser {} ", userDetails.toString());
        UserDetails userDetailsFromDb = userService.createUser(userDetails);
        return ResponseEntity.ok(userDetailsFromDb);
    }

    @PutMapping
    public ResponseEntity<UserDetails> updateUser(@RequestBody UserDetails userDetails) {
        log.info("In updateUser {} ", userDetails.toString());
        UserDetails userDetailsFromDb = userService.createUser(userDetails);
        return ResponseEntity.ok(userDetailsFromDb);
    }

    @DeleteMapping("/{userName}")
    public ResponseEntity<UserDetails> deleteUser(@PathVariable String userName) {
        log.info("In deleteUser {} ", userName);
        UserDetails userDetailsFromDb = userService.deleteUser(userName);
        return ResponseEntity.ok(userDetailsFromDb);
    }

    @GetMapping("/{userName}")
    public ResponseEntity<UserDetails> getUser(@PathVariable String userName) {
        log.info("In getUser {} ", userName);
        UserDetails userDetailsFromDb = userService.getUser(userName);
        return ResponseEntity.ok(userDetailsFromDb);
    }

    @GetMapping
    public ResponseEntity<List<UserDetails>> getAllUser() {
        log.info("In getAllUser");
        List<UserDetails> userDetailsFromDbList = userService.getAllUser();
        if (userDetailsFromDbList != null) {
            return ResponseEntity.ok(userDetailsFromDbList);
        } else {
            return new ResponseEntity(new ArrayList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
