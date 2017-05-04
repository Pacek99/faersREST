/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest;

import com.mycompany.faersrest.postgresDAO.PostgresBrandNameDao;
import org.springframework.jdbc.core.JdbcTemplate;
import com.mycompany.faersrest.DAO.BrandNameDao;
import com.mycompany.faersrest.DAO.SubstanceNameDao;
import com.mycompany.faersrest.postgresDAO.PostgresSubstanceNameDao;
import org.postgresql.ds.PGPoolingDataSource;


/**
 *
 * @author Patrik Rojek
 */
public enum DaoFactory {
    INSTANCE;

    private BrandNameDao postgresBrandNameDao;
    private SubstanceNameDao postgresSubstanceNameDao;

    public BrandNameDao getBrandNameDao() {
        return getPostgresBrandNameDao();
    }
    
    public SubstanceNameDao getSubstanceNameDao() {
        return getPostgresSubstanceNameDao();
    }

    private BrandNameDao getPostgresBrandNameDao() {
        if (postgresBrandNameDao == null) {
            PGPoolingDataSource dataSource = new PGPoolingDataSource();
            dataSource.setUrl("jdbc:postgresql://localhost:5432/faersdb");
            dataSource.setUser("postgres");
            dataSource.setPassword("sql");
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
            postgresBrandNameDao = new PostgresBrandNameDao(jdbcTemplate);
        }
        return postgresBrandNameDao;
    }

    private SubstanceNameDao getPostgresSubstanceNameDao() {
        if (postgresSubstanceNameDao == null) {
            PGPoolingDataSource dataSource = new PGPoolingDataSource();
            dataSource.setUrl("jdbc:postgresql://localhost:5432/faersdb");
            dataSource.setUser("postgres");
            dataSource.setPassword("sql");
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
            postgresSubstanceNameDao = new PostgresSubstanceNameDao(jdbcTemplate);
        }
        return postgresSubstanceNameDao;
    }
}
