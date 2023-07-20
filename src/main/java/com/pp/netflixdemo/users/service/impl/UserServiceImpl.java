/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pp.netflixdemo.users.service.impl;

import com.pp.netflixdemo.users.entites.UserDetails;
import com.pp.netflixdemo.users.exceptions.ResoureNotFoundException;
import com.pp.netflixdemo.users.repositories.UserRepository;
import com.pp.netflixdemo.users.service.UserService;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hkorada
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails createUser(UserDetails userDetails) {
        userDetails.setUserId(UUID.randomUUID().toString().replace("-", ""));
        return userRepository.save(userDetails);
    }

    @Override
    public UserDetails updateUser(UserDetails userDetails) {
        return userRepository.save(userDetails);
    }

    @Override
    public UserDetails deleteUser(String userName) {
        UserDetails foundUserDetails = userRepository.findByUserNameLike(userName);
        userRepository.delete(foundUserDetails);
        return foundUserDetails;
    }

    @Override
    public UserDetails getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(() -> new ResoureNotFoundException("Unable to find the user : " + userId));
    }

    @Override
    public List<UserDetails> getAllUser() {
        return userRepository.findAll();
    }

}
