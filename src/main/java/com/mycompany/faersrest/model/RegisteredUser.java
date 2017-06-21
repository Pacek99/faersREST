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
public class RegisteredUser {
    
    private String login;
    private String mail;
    private String pass;
    private String salt;

    public RegisteredUser() {
    }

    public RegisteredUser(String login, String mail, String pass, String salt) {
        this.login = login;
        this.mail = mail;
        this.pass = pass;
        this.salt = salt;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
    
    
    
}
