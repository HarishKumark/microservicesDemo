/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pp.netflixdemo.users.service;

import com.pp.netflixdemo.users.entites.UserDetails;
import java.util.List;

/**
 *
 * @author hkorada
 */
public interface UserService {

    UserDetails createUser(UserDetails userDetails);

    UserDetails updateUser(UserDetails userDetails);

    UserDetails deleteUser(String userName);

    UserDetails getUser(String userId);

    List<UserDetails> getAllUser();

}
