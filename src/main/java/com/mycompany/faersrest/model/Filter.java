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
public class Filter {
    
    private String brand_name;
    private String substance_name;
    private String manufacturer_name;

    public Filter() {
    }

    public Filter(String brand_name, String substance_name, String manufacturer_name) {
        this.brand_name = brand_name;
        this.substance_name = substance_name;
        this.manufacturer_name = manufacturer_name;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getSubstance_name() {
        return substance_name;
    }

    public void setSubstance_name(String substance_name) {
        this.substance_name = substance_name;
    }

    public String getManufacturer_name() {
        return manufacturer_name;
    }

    public void setManufacturer_name(String manufacturer_name) {
        this.manufacturer_name = manufacturer_name;
    }
    
    
    
    
}
