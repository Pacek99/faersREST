/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.postgresDAO;

import com.mycompany.faersrest.DAO.TestModulesDao;
import com.mycompany.faersrest.model.SupportClass;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Patrik Rojek
 */
public class PostgresTestModulesDao implements TestModulesDao{
    
    private JdbcTemplate jdbcTemplate;
    
    public PostgresTestModulesDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<SupportClass> testModules() {
        String sql = "SELECT count(openfda_id) as value FROM faers.openfda_drug_info_manufacturer_name;";
        BeanPropertyRowMapper<SupportClass> bprm = new BeanPropertyRowMapper<>(SupportClass.class);
        return jdbcTemplate.query(sql, bprm);
    }
}
