package com.Portfolio.ApiPortfolio.controller;

import com.Portfolio.ApiPortfolio.model.ComputerSkill;
import com.Portfolio.ApiPortfolio.service.ComputerSkillService;
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
@RequestMapping("/computerskill")
public class ComputerSkillController {
    
    private final ComputerSkillService computerSkillService;
    
    public ComputerSkillController (ComputerSkillService computerSkillService){
        this.computerSkillService = computerSkillService;
    }
    
    @PutMapping("/update")
    public ResponseEntity<ComputerSkill> editComputerSkill(@RequestBody ComputerSkill computerSkil){
        ComputerSkill updateComputerSkill=computerSkillService.updateComputerSkill(computerSkil);
        return new ResponseEntity<>(updateComputerSkill, HttpStatus.OK);
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<ComputerSkill>> getComputerSkill(){
        List<ComputerSkill> computeSkil=computerSkillService.findComputerSkill();
        return new ResponseEntity<>(computeSkil, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<ComputerSkill> createComputerSkill(@RequestBody ComputerSkill computeSkil){
        ComputerSkill newComputerSkill = computerSkillService.addComputerSkill(computeSkil);
        return new ResponseEntity<>(newComputerSkill, HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{idComSki}")
    public ResponseEntity<?> deleteComputerSkill(@PathVariable("idComSki") Long idComSki){
        computerSkillService.deleteComputerSkill(idComSki);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
