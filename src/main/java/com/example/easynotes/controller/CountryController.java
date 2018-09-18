/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.easynotes.controller;

import com.example.easynotes.model.Country;
import com.example.easynotes.repository.CountryRepository;
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
@RequestMapping("/countries")
public class CountryController {
    
    @Autowired
    CountryRepository cr;
    
    @GetMapping("/list")
    public List<Country> getAllCount(){
    
        return  cr.findAll();
    }
}
