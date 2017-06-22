/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.postgresDAO;

import com.mycompany.faersrest.DAO.RegisteredUserDao;
import com.mycompany.faersrest.model.RegisteredUser;
import com.mycompany.faersrest.model.SupportClass;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Patrik Rojek
 */
public class PostgresRegisteredUserDao implements RegisteredUserDao {

    private JdbcTemplate jdbcTemplate;
    
    public PostgresRegisteredUserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public void addNewUser(RegisteredUser ru) {
        String sql = "insert into faers.faers_user(login, mail, pass, salt) VALUES"
                + " ('"+ ru.getLogin() + "','"+ ru.getMail() + "','"+ ru.getPass() + "','"+ ru.getSalt() + "')";
        jdbcTemplate.execute(sql);
    } 
    
    @Override
    public List<SupportClass> existingUser(String login) {
        String sql = "select count(login) as value from faers.faers_user where login='" + login + "'";
        BeanPropertyRowMapper<SupportClass> bprm = new BeanPropertyRowMapper<>(SupportClass.class);
        return jdbcTemplate.query(sql, bprm);
    } 
    
}
