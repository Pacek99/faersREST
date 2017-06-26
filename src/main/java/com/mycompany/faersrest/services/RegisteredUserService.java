/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.services;

import com.mycompany.faersrest.DAO.RegisteredUserDao;
import com.mycompany.faersrest.DaoFactory;
import com.mycompany.faersrest.PasswordHashing;
import com.mycompany.faersrest.model.RegisteredUser;
import com.mycompany.faersrest.model.SupportClass;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Patrik Rojek
 */
public class RegisteredUserService {
    
    private RegisteredUserDao dao;

    public RegisteredUserService() {
        dao = DaoFactory.INSTANCE.getRegisteredUserDao();
    } 
    
    public void addUser(RegisteredUser ru) throws NoSuchAlgorithmException{
        byte[] newSalt = PasswordHashing.getSalt();
        ru.setSalt(DatatypeConverter.printBase64Binary(newSalt));
        String hashedPass = PasswordHashing.get_SHA_256_SecurePassword(ru.getPass(), newSalt);
        ru.setPass(hashedPass);
        dao.addNewUser(ru);
    }
    
    public List<SupportClass> checkUser(String login){
        return dao.existingUser(login);
    }
}
