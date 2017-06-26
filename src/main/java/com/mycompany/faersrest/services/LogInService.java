/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.services;

import com.mycompany.faersrest.DAO.LogInDao;
import com.mycompany.faersrest.DaoFactory;
import com.mycompany.faersrest.PasswordHashing;
import com.mycompany.faersrest.model.RegisteredUser;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Patrik Rojek
 */
public class LogInService {
    
     private LogInDao dao;

    public LogInService() {
        dao = DaoFactory.INSTANCE.getLogInDao();
    } 

    public String checkLogin(RegisteredUser ru){
        byte[] salt = DatatypeConverter.parseBase64Binary(dao.getSalt(ru.getLogin()).get(0).getSalt());
        String hashedPass = PasswordHashing.get_SHA_256_SecurePassword(ru.getPass(), salt);
        if (hashedPass.equals(dao.getPassword(ru.getLogin()).get(0).getPass())) {
            return "True";
        } else {
            return "False";
        }
    }
    
}
