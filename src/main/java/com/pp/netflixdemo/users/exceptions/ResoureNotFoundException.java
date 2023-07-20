/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pp.netflixdemo.users.exceptions;

/**
 *
 * @author hkorada
 */
public class ResoureNotFoundException extends RuntimeException {

    public ResoureNotFoundException() {
        super("No data Found");
    }

    public ResoureNotFoundException(String message) {
        super(message);
    }

}
