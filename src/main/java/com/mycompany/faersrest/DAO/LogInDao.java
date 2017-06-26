/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.DAO;

import com.mycompany.faersrest.model.Password;
import com.mycompany.faersrest.model.Salt;
import java.util.List;

/**
 *
 * @author Patrik Rojek
 */
public interface LogInDao {
    
    List<Salt> getSalt(String login);
    
    List<Password> getPassword(String login);
}
