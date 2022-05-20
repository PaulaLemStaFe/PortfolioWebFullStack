package com.Portfolio.ApiPortfolio.service;

import com.Portfolio.ApiPortfolio.model.Experience;
import com.Portfolio.ApiPortfolio.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienceService {
    
    private final ExperienceRepository experienceRepo;
    
    @Autowired
    public ExperienceService(ExperienceRepository experienceRepo) {
        this.experienceRepo = experienceRepo;
    }
    
    public Experience addExperience(Experience experience) {
        return experienceRepo.save(experience);
    }
    
    public List<Experience> findExperience(){
        return experienceRepo.findAll();
    }
    
    public Experience updateExperience(Experience experienc){
        return experienceRepo.save(experienc);
    }
    
    public void deleteExperience(Long idExperience){
        experienceRepo.deleteById(idExperience);
    }
    
}
