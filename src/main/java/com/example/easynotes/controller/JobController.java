/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.easynotes.controller;

import com.example.easynotes.model.Job;
import com.example.easynotes.repository.JobRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author muhammad
 */

@RestController
@RequestMapping("/jobs")
public class JobController {
    
    @Autowired
    JobRepo jr;
    
    @GetMapping("/list")
    public List<Job> jobBinding(){
    
        return jr.findAll();
    }
    
}
