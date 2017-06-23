/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.postgresDAO;

import com.mycompany.faersrest.DAO.PreferredDrugsDao;
import com.mycompany.faersrest.model.PreferredDrugs;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Patrik Rojek
 */
public class PostgresPreferredDrugsDao implements PreferredDrugsDao {
    
    private JdbcTemplate jdbcTemplate;
    
    public PostgresPreferredDrugsDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public List<PreferredDrugs> getPreferredDrugs(String user) {
        String sql = "select pd.drug_id,odibn.brand_name from faers.preferred_drug pd join faers.openfda_drug_info_brand_name odibn on pd.drug_id=odibn.openfda_id where faers_user_id=(select id from faers.faers_user where login='" + user + "')";
        BeanPropertyRowMapper<PreferredDrugs> bprm = new BeanPropertyRowMapper<>(PreferredDrugs.class);
        return jdbcTemplate.query(sql, bprm);
    }

    @Override
    public void deletePreferredDrug(String user, String brandName) {
        String sql = "delete from faers.preferred_drug where faers_user_id=(select id from faers.faers_user where login='" + user + "')\n" +
                     "and drug_id=(select openfda_id from faers.openfda_drug_info_brand_name where brand_name='" + brandName + "' limit 1)";
        jdbcTemplate.execute(sql);
    }

    @Override
    public void addPreferredDrug(String user, String brandName) {
        String sql = "insert into faers.preferred_drug(faers_user_id,drug_id)\n" +
                     "values ((select id from faers.faers_user where login='" + user + "'),\n" +
                     "(select openfda_id from faers.openfda_drug_info_brand_name where brand_name='" + brandName + "' limit 1))";
        jdbcTemplate.execute(sql);
    }
}
