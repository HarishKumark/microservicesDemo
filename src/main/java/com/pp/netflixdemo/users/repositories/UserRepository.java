/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pp.netflixdemo.users.repositories;

import com.pp.netflixdemo.users.entites.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author hkorada
 */
public interface UserRepository extends JpaRepository<UserDetails, String> {

    @Query("SELECT ud FROM UserDetails ud WHERE ud.userName LIKE %?1%")
    UserDetails findByUserNameLike(String userName);
}
