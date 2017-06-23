/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.services;

import com.mycompany.faersrest.DAO.PreferredDrugsDao;
import com.mycompany.faersrest.DaoFactory;
import com.mycompany.faersrest.model.PreferredDrugs;
import java.util.List;

/**
 *
 * @author Patrik Rojek
 */
public class PreferredDrugsService {
    
    private PreferredDrugsDao dao;

    public PreferredDrugsService() {
        dao = DaoFactory.INSTANCE.getPreferredDrugsDao();
    }    
    
    public List<PreferredDrugs> getPreferredDrugs(String user){        
        List<PreferredDrugs> list = dao.getPreferredDrugs(user);
        return list;
    }

    public void deletePreferredDrug(String user, String brandName) {
        dao.deletePreferredDrug(user,brandName);
    }    

    public void addPreferredDrug(String user, String brandName) {
        dao.addPreferredDrug(user,brandName);
    }
}
