/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.easynotes.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author muhammad
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RegionExcep extends RuntimeException{
    
    private String resourceRegionName;
    private String regionName;
    private Object regionValue;

    public RegionExcep(String resourceRegionName, String regionName, Object regionValue) {
        super(String.format("%s not found with %s : '%s'", resourceRegionName, regionName, regionValue));
        
        this.resourceRegionName = resourceRegionName;
        this.regionName = regionName;
        this.regionValue = regionValue;
    }

    public String getResourceRegionName() {
        return resourceRegionName;
    }

    public String getRegionName() {
        return regionName;
    }

    public Object getRegionValue() {
        return regionValue;
    }

    public void setResourceRegionName(String resourceRegionName) {
        this.resourceRegionName = resourceRegionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public void setRegionValue(Object regionValue) {
        this.regionValue = regionValue;
    }
    
}
