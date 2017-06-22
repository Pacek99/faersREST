/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.postgresDAO;

import com.mycompany.faersrest.DAO.SideEffectsDao;
import com.mycompany.faersrest.model.SideEffects;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Patrik Rojek
 */
public class PostgresSideEffectsDao implements SideEffectsDao{
    
    private JdbcTemplate jdbcTemplate;
    
    public PostgresSideEffectsDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public List<SideEffects> getSideEffects(String name) {
        String sql = "select r.meddra_pt, count(r.meddra_pt) as quantity \n" 
                + "from faers.reaction as r join faers.patient_reaction_mapping as prm \n" 
                + "on prm.reaction_id = r.id where prm.patient_id \n" 
                + "in (select pdm.patient_id from faers.patient_drug_mapping as pdm \n" 
                + "join faers.drug as d on pdm.drug_id = d.id where pdm.drug_id \n" 
                + "in (select d.id from faers.drug as d join faers.openfda_drug_info as odi \n" 
                + "on d.openfda_drug_info_id = odi.id where d.openfda_drug_info_id\n" 
                + "in (select odibn.openfda_id from faers.openfda_drug_info_brand_name\n" 
                + "as odibn where odibn.brand_name = '" + name +"')\n" 
                + ")) group by r.meddra_pt order by quantity desc";
        BeanPropertyRowMapper<SideEffects> bprm = new BeanPropertyRowMapper<>(SideEffects.class);
        return jdbcTemplate.query(sql, bprm);
    }

    @Override
    public List<SideEffects> getSideEffectsByDate(String name, String date) {
        String sql = "select r.meddra_pt, count(r.meddra_pt) as quantity \n" 
                + "from faers.reaction as r join faers.patient_reaction_mapping as prm \n" 
                + "on prm.reaction_id = r.id join faers.event_result as er \n"
                + "on prm.patient_id = er.patient_id where prm.patient_id \n" 
                + "in (select pdm.patient_id from faers.patient_drug_mapping as pdm \n" 
                + "join faers.drug as d on pdm.drug_id = d.id where pdm.drug_id \n" 
                + "in (select d.id from faers.drug as d join faers.openfda_drug_info as odi \n" 
                + "on d.openfda_drug_info_id = odi.id where d.openfda_drug_info_id\n" 
                + "in (select odibn.openfda_id from faers.openfda_drug_info_brand_name\n" 
                + "as odibn where odibn.brand_name = '" + name +"')\n" 
                + ")) AND er.receive_date::integer > " + date +" \n"
                + "group by er.receive_date,r.meddra_pt order by quantity desc";
        BeanPropertyRowMapper<SideEffects> bprm = new BeanPropertyRowMapper<>(SideEffects.class);
        return jdbcTemplate.query(sql, bprm);}
}
