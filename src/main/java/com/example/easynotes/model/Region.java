/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.easynotes.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 *
 * @author muhammad
 */
@Entity
@Table(name = "regions")
@EntityListeners(AuditingEntityListener.class)

public class Region {

    @Id
    @Column(name = "region_id")
    private Integer regionId;
    @Column(name = "region_name")
    private String regionName;
    
    @OneToMany(mappedBy = "regionId", fetch = FetchType.LAZY)
    private List<Country> countries;

    public Region() {
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
    
}