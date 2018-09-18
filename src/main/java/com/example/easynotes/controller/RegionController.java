/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.easynotes.controller;

import com.example.easynotes.model.Region;
import com.example.easynotes.repository.RegionRepo;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author muhammad
 */
@RestController
@RequestMapping("/regions")
public class RegionController {

    @Autowired
    RegionRepo regionRepo;

    // Get All region
    @GetMapping("/list")
    public List<Region> getAllRegions() {
        return regionRepo.findAll();
    }

    // add regions site
    @PostMapping("/add")
    public Region saveRegion(@Valid @RequestBody Region regi) {
        return regionRepo.save(regi);
    }

    // Get by id
    @GetMapping("{regionId}")
    public Optional<Region> getRegion(@PathVariable(value = "regionId") Integer regionId) {

        return regionRepo.findById(regionId);

    }

    
    // Delete a Note
    @DeleteMapping("{regionId}")
    public ResponseEntity<?> deleteReg(@PathVariable(value = "regionId") Integer regionId) {
        regionRepo.deleteById(regionId);

        return ResponseEntity.ok().build();
    }

}
