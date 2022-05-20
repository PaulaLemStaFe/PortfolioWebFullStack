package com.Portfolio.ApiPortfolio.service;

import com.Portfolio.ApiPortfolio.model.Project;
import com.Portfolio.ApiPortfolio.repository.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProjectService {
    
    private final ProjectRepository projectRepo;
    
    @Autowired
    public ProjectService(ProjectRepository projectRepo) {
        this.projectRepo = projectRepo;
    }
    
    public Project addProject(Project project) {
        return projectRepo.save(project);
    }
    
    public List<Project> findProject(){
        return projectRepo.findAll();
    }
    
    public Project updateProject(Project projec){
        return projectRepo.save(projec);
    }
    
    public void deleteProject(Long idProject){
        projectRepo.deleteById(idProject);
    }
    
}
