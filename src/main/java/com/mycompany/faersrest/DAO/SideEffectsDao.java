/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.DAO;

import com.mycompany.faersrest.model.SideEffects;
import java.util.List;

/**
 *
 * @author Patrik Rojek
 */
public interface SideEffectsDao {
    List<SideEffects> getSideEffects(String name);
    
    List<SideEffects> getSideEffectsByDate(String name, String date);
}
