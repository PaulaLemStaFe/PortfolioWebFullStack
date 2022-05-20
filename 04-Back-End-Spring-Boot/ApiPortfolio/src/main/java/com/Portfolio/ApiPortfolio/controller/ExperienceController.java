package com.Portfolio.ApiPortfolio.controller;

import com.Portfolio.ApiPortfolio.model.Experience;
import com.Portfolio.ApiPortfolio.service.ExperienceService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experience")
public class ExperienceController {
    
    private final ExperienceService experienceService;
    
    public ExperienceController (ExperienceService experienceService){
        this.experienceService = experienceService;
    }
    
    @PutMapping("/update")
    public ResponseEntity<Experience> editExperience(@RequestBody Experience experienc){
        Experience updateExperience=experienceService.updateExperience(experienc);
        return new ResponseEntity<>(updateExperience, HttpStatus.OK);
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Experience>> getExperience(){
        List<Experience> experien=experienceService.findExperience();
        return new ResponseEntity<>(experien, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Experience> createExperience(@RequestBody Experience experien){
        Experience newExperience = experienceService.addExperience(experien);
        return new ResponseEntity<>(newExperience, HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{idExperience}")
    public ResponseEntity<?> deleteExperience(@PathVariable("idExperience") Long idExperience){
        experienceService.deleteExperience(idExperience);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
