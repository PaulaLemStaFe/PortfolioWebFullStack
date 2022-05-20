package com.Portfolio.ApiPortfolio.service;

import com.Portfolio.ApiPortfolio.model.ComputerSkill;
import com.Portfolio.ApiPortfolio.repository.ComputerSkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ComputerSkillService {
    
    private final ComputerSkillRepository comskilRepo;
    
    @Autowired
    public ComputerSkillService(ComputerSkillRepository comskilRepo) {
        this.comskilRepo = comskilRepo;
    }
    
    public ComputerSkill addComputerSkill(ComputerSkill compskil) {
        return comskilRepo.save(compskil);
    }
    
    public List<ComputerSkill> findComputerSkill(){
        return comskilRepo.findAll();
    }
    
    public ComputerSkill updateComputerSkill(ComputerSkill compuskill){
        return comskilRepo.save(compuskill);
    }
    
    public void deleteComputerSkill(Long idComSki){
        comskilRepo.deleteById(idComSki);
    }
    
}
