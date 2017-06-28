/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.services;

import com.mycompany.faersrest.DAO.FilterDao;
import com.mycompany.faersrest.DaoFactory;
import com.mycompany.faersrest.model.Filter;
import java.util.List;

/**
 *
 * @author Patrik Rojek
 */
public class FilterService {
    
    private FilterDao dao;

    public FilterService() {
        dao = DaoFactory.INSTANCE.getFilterDao();
    }

    public List<Filter> filterDrugs(String brandName, String substanceName, String manufacturerName) {
        if (brandName.equals("0")) {
            brandName="";
        }
        if (substanceName.equals("0")) {
            substanceName="";
        }
        if (manufacturerName.equals("0")) {
            manufacturerName="";
        }
        List<Filter> list = dao.filterDrugs(brandName.toUpperCase(), substanceName.toUpperCase(), manufacturerName.toUpperCase());
        return list;
    }
    
    
}
