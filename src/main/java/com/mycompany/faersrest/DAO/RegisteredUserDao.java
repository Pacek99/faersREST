/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.DAO;

import com.mycompany.faersrest.model.RegisteredUser;
import com.mycompany.faersrest.model.SupportClass;
import java.util.List;

/**
 *
 * @author Patrik Rojek
 */
public interface RegisteredUserDao {
    
    void addNewUser(RegisteredUser registeredUser);
    
    List<SupportClass> existingUser(String login);
}
