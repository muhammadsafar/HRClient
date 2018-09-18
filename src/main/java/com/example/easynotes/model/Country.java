/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.easynotes.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 *
 * @author muhammad
 */
@Entity
@Table(name = "countries")
@EntityListeners(AuditingEntityListener.class)
public class Country implements Serializable{

    @Id
    @Column(name = "country_id")
    private String countryId;
    @Column(name = "country_name")
    private String countryName;
    
    @JoinColumn(name = "REGION_ID", referencedColumnName = "REGION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Region regionId;

    
    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Region getRegionId() {
        return regionId;
    }

    public void setRegionId(Region regionId) {
        this.regionId = regionId;
    }

    
}
