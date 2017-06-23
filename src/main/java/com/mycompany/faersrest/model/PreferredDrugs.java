/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.model;

/**
 *
 * @author Patrik Rojek
 */
public class PreferredDrugs {
    
    private String brand_name;
    private long drug_id;

    public PreferredDrugs() {
    }

    public PreferredDrugs(String brand_name, long drug_id) {
        this.brand_name = brand_name;
        this.drug_id = drug_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public long getDrug_id() {
        return drug_id;
    }

    public void setDrug_id(long drug_id) {
        this.drug_id = drug_id;
    }
}
