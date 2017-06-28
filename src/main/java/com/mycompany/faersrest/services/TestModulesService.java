/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.services;

import com.mycompany.faersrest.DAO.TestModulesDao;
import com.mycompany.faersrest.DaoFactory;
import com.mycompany.faersrest.model.SupportClass;
import java.util.List;

/**
 *
 * @author Patrik Rojek
 */
public class TestModulesService {

    private TestModulesDao dao;

    public TestModulesService() {
        dao = DaoFactory.INSTANCE.getTestModulesDao();
    }

    public String testModules() {
        List<SupportClass> list = dao.testModules();
        if (list.get(0).getValue() != 0) {
            return "True";
        } else {
            return "False";
        }
    }

}
