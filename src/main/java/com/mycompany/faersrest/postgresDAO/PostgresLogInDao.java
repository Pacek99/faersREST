/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.postgresDAO;

import com.mycompany.faersrest.model.Salt;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.mycompany.faersrest.DAO.LogInDao;
import com.mycompany.faersrest.model.Password;

/**
 *
 * @author Patrik Rojek
 */
public class PostgresLogInDao implements LogInDao{
    
    private JdbcTemplate jdbcTemplate;
    
    public PostgresLogInDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Salt> getSalt(String login) {
        String sql = "select fu.salt from faers.faers_user fu where fu.login='" + login +"'";
        BeanPropertyRowMapper<Salt> bprm = new BeanPropertyRowMapper<>(Salt.class);
        return jdbcTemplate.query(sql, bprm);
    }
    
    @Override
    public List<Password> getPassword(String login) {
        String sql = "select fu.pass from faers.faers_user fu where fu.login='" + login +"'";
        BeanPropertyRowMapper<Password> bprm = new BeanPropertyRowMapper<>(Password.class);
        return jdbcTemplate.query(sql, bprm);
    }
    
}
