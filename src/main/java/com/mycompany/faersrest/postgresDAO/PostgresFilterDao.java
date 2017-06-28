/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.postgresDAO;

import com.mycompany.faersrest.DAO.FilterDao;
import com.mycompany.faersrest.model.Filter;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Patrik Rojek
 */
public class PostgresFilterDao implements FilterDao{
    
    private JdbcTemplate jdbcTemplate;
    
    public PostgresFilterDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Filter> filterDrugs(String brand_name, String substance_name, String manufacturer_name) {
        String sql = "select distinct bn.brand_name, sn.substance_name, mn.manufacturer_name \n" +
"                from faers.openfda_drug_info_brand_name bn inner join faers.openfda_drug_info_substance_name sn \n" +
"                on (bn.openfda_id = sn.openfda_id) join faers.openfda_drug_info_manufacturer_name mn \n" +
"                on (bn.openfda_id = mn.openfda_id) where upper(bn.brand_name) like '%" + brand_name +"%'and upper(sn.substance_name) like '%" + substance_name +"%' \n" +
"                and upper(mn.manufacturer_name) like '%" + manufacturer_name +"%'";
        BeanPropertyRowMapper<Filter> bprm = new BeanPropertyRowMapper<>(Filter.class);
        return jdbcTemplate.query(sql, bprm);
    }
    
}
