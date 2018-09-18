/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.easynotes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 *
 * @author muhammad
 */


@Entity
@Table(name = "jobs")
@EntityListeners(AuditingEntityListener.class)
public class Job {
    
     @Id
    @Column(name = "job_id")
    private String jobId;
    @Column(name = "job_title")
    private String jobTitle;
    @Column(name = "min_salary")
    private Integer minSal;
    @Column(name = "max_salary")
    private Integer maxSal;

    /**
     * @return the jobId
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * @param jobId the jobId to set
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * @return the jobTitle
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * @param jobTitle the jobTitle to set
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * @return the minSal
     */
    public Integer getMinSal() {
        return minSal;
    }

    /**
     * @param minSal the minSal to set
     */
    public void setMinSal(Integer minSal) {
        this.minSal = minSal;
    }

    /**
     * @return the maxSal
     */
    public Integer getMaxSal() {
        return maxSal;
    }

    /**
     * @param maxSal the maxSal to set
     */
    public void setMaxSal(Integer maxSal) {
        this.maxSal = maxSal;
    }
}
