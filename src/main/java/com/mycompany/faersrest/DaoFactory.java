/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest;

import com.mycompany.faersrest.postgresDAO.PostgresBrandNameDao;
import org.springframework.jdbc.core.JdbcTemplate;
import com.mycompany.faersrest.DAO.BrandNameDao;
import com.mycompany.faersrest.DAO.FilterDao;
import com.mycompany.faersrest.DAO.LogInDao;
import com.mycompany.faersrest.DAO.ManufacturerNameDao;
import com.mycompany.faersrest.DAO.PreferredDrugsDao;
import com.mycompany.faersrest.DAO.RegisteredUserDao;
import com.mycompany.faersrest.DAO.SideEffectsDao;
import com.mycompany.faersrest.DAO.SubstanceNameDao;
import com.mycompany.faersrest.DAO.TestModulesDao;
import com.mycompany.faersrest.postgresDAO.PostgresFilterDao;
import com.mycompany.faersrest.postgresDAO.PostgresLogInDao;
import com.mycompany.faersrest.postgresDAO.PostgresManufacturerNameDao;
import com.mycompany.faersrest.postgresDAO.PostgresPreferredDrugsDao;
import com.mycompany.faersrest.postgresDAO.PostgresRegisteredUserDao;
import com.mycompany.faersrest.postgresDAO.PostgresSideEffectsDao;
import com.mycompany.faersrest.postgresDAO.PostgresSubstanceNameDao;
import com.mycompany.faersrest.postgresDAO.PostgresTestModulesDao;
import java.io.File;
import java.util.Scanner;
import org.postgresql.ds.PGPoolingDataSource;

/**
 *
 * @author Patrik Rojek
 */
public enum DaoFactory {
    INSTANCE;

    private String pass;

    private BrandNameDao postgresBrandNameDao;
    private SubstanceNameDao postgresSubstanceNameDao;
    private ManufacturerNameDao postgresManufacturerNameDao;
    private SideEffectsDao postgresSideEffectsDao;
    private RegisteredUserDao postgresRegisteredUserDao;
    private PreferredDrugsDao postgresPreferredDrugsDao;
    private LogInDao postgresLogInDao;
    private FilterDao postgresFilterDao;
    private TestModulesDao postgresTestModulesDao;

    private DaoFactory() {
        try {
            Scanner citac = new Scanner(new File("C:\\Users\\Patrik Rojek\\Documents\\NetBeansProjects\\faersREST/config.txt"));
            pass = citac.next();
            citac.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public BrandNameDao getBrandNameDao() {
        return getPostgresBrandNameDao();
    }

    public SubstanceNameDao getSubstanceNameDao() {
        return getPostgresSubstanceNameDao();
    }

    public ManufacturerNameDao getManufacturerNameDao() {
        return getPostgresManufacturerNameDao();
    }

    public SideEffectsDao getSideEffectsDao() {
        return getPostgresSideEffectsDao();
    }

    public RegisteredUserDao getRegisteredUserDao() {
        return getPostgresRegisteredUserDao();
    }

    public PreferredDrugsDao getPreferredDrugsDao() {
        return getPostgresPreferredDrugsDao();
    }

    public LogInDao getLogInDao() {
        return getPostgresLogInDao();
    }

    public FilterDao getFilterDao() {
        return getPostgresFilterDao();
    }

    public TestModulesDao getTestModulesDao() {
        return getPostgresTestModulesDao();
    }

    private BrandNameDao getPostgresBrandNameDao() {
        if (postgresBrandNameDao == null) {
            PGPoolingDataSource dataSource = new PGPoolingDataSource();
            dataSource.setUrl("jdbc:postgresql://localhost:5432/faersdb");
            dataSource.setUser("faers");
            dataSource.setPassword(pass);
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
            postgresBrandNameDao = new PostgresBrandNameDao(jdbcTemplate);
        }
        return postgresBrandNameDao;
    }

    private SubstanceNameDao getPostgresSubstanceNameDao() {
        if (postgresSubstanceNameDao == null) {
            PGPoolingDataSource dataSource = new PGPoolingDataSource();
            dataSource.setUrl("jdbc:postgresql://localhost:5432/faersdb");
            dataSource.setUser("faers");
            dataSource.setPassword(pass);
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
            postgresSubstanceNameDao = new PostgresSubstanceNameDao(jdbcTemplate);
        }
        return postgresSubstanceNameDao;
    }

    private ManufacturerNameDao getPostgresManufacturerNameDao() {
        if (postgresManufacturerNameDao == null) {
            PGPoolingDataSource dataSource = new PGPoolingDataSource();
            dataSource.setUrl("jdbc:postgresql://localhost:5432/faersdb");
            dataSource.setUser("faers");
            dataSource.setPassword(pass);
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
            postgresManufacturerNameDao = new PostgresManufacturerNameDao(jdbcTemplate);
        }
        return postgresManufacturerNameDao;
    }

    private SideEffectsDao getPostgresSideEffectsDao() {
        if (postgresSideEffectsDao == null) {
            PGPoolingDataSource dataSource = new PGPoolingDataSource();
            dataSource.setUrl("jdbc:postgresql://localhost:5432/faersdb");
            dataSource.setUser("faers");
            dataSource.setPassword(pass);
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
            postgresSideEffectsDao = new PostgresSideEffectsDao(jdbcTemplate);
        }
        return postgresSideEffectsDao;
    }

    private RegisteredUserDao getPostgresRegisteredUserDao() {
        if (postgresRegisteredUserDao == null) {
            PGPoolingDataSource dataSource = new PGPoolingDataSource();
            dataSource.setUrl("jdbc:postgresql://localhost:5432/faersdb");
            dataSource.setUser("faers");
            dataSource.setPassword(pass);
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
            postgresRegisteredUserDao = new PostgresRegisteredUserDao(jdbcTemplate);
        }
        return postgresRegisteredUserDao;
    }

    private PreferredDrugsDao getPostgresPreferredDrugsDao() {
        if (postgresPreferredDrugsDao == null) {
            PGPoolingDataSource dataSource = new PGPoolingDataSource();
            dataSource.setUrl("jdbc:postgresql://localhost:5432/faersdb");
            dataSource.setUser("faers");
            dataSource.setPassword(pass);
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
            postgresPreferredDrugsDao = new PostgresPreferredDrugsDao(jdbcTemplate);
        }
        return postgresPreferredDrugsDao;
    }

    private LogInDao getPostgresLogInDao() {
        if (postgresLogInDao == null) {
            PGPoolingDataSource dataSource = new PGPoolingDataSource();
            dataSource.setUrl("jdbc:postgresql://localhost:5432/faersdb");
            dataSource.setUser("faers");
            dataSource.setPassword(pass);
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
            postgresLogInDao = new PostgresLogInDao(jdbcTemplate);
        }
        return postgresLogInDao;
    }

    private FilterDao getPostgresFilterDao() {
        if (postgresFilterDao == null) {
            PGPoolingDataSource dataSource = new PGPoolingDataSource();
            dataSource.setUrl("jdbc:postgresql://localhost:5432/faersdb");
            dataSource.setUser("faers");
            dataSource.setPassword(pass);
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
            postgresFilterDao = new PostgresFilterDao(jdbcTemplate);
        }
        return postgresFilterDao;
    }

    private TestModulesDao getPostgresTestModulesDao() {
        if (postgresTestModulesDao == null) {
            PGPoolingDataSource dataSource = new PGPoolingDataSource();
            dataSource.setUrl("jdbc:postgresql://localhost:5432/faersdb");
            dataSource.setUser("faers");
            dataSource.setPassword(pass);
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
            postgresTestModulesDao = new PostgresTestModulesDao(jdbcTemplate);
        }
        return postgresTestModulesDao;
    }
}
