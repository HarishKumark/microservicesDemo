/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pp.netflixdemo.users.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author hkorada
 */
@Entity
@Data
public class UserDetails {

    @Id
    @Column
    private String userId;

    @Column
    private String userName;

    @Column
    private String userEmailId;

    @Column
    private String userPassword;

    @Column
    private boolean isPaidCustomer;

}
