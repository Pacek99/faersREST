/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.model;

/**
 *
 * @author Patrik Rojek
 */

/*this class is basically just to be able to return integer value from 
BeanPropertyRowMapper in class PostgresRegisteredUserDao*/
public class SupportClass {
    
    private int value;

    public SupportClass() {
    }

    public SupportClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
