/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.services;

import com.mycompany.faersrest.DAO.RegisteredUserDao;
import com.mycompany.faersrest.DaoFactory;
import com.mycompany.faersrest.model.RegisteredUser;
import com.mycompany.faersrest.model.SupportClass;
import java.util.List;

/**
 *
 * @author Patrik Rojek
 */
public class RegisteredUserService {
    
    private RegisteredUserDao dao;

    public RegisteredUserService() {
        dao = DaoFactory.INSTANCE.getRegisteredUserDao();
    } 
    
    public void addUser(RegisteredUser ru){
        dao.addNewUser(ru);
    }
    
    public List<SupportClass> checkUser(String login){
        return dao.existingUser(login);
    }
}
