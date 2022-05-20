package com.Portfolio.ApiPortfolio.controller;

import com.Portfolio.ApiPortfolio.model.Project;
import com.Portfolio.ApiPortfolio.service.ProjectService;
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
@RequestMapping("/project")
public class ProjectController {
    
    private final ProjectService projectservice;
    
    public ProjectController(ProjectService projectservice){
        this.projectservice = projectservice;
    }
    
    @PutMapping("/update")
    public ResponseEntity<Project> editProject(@RequestBody Project projec){
        Project updateProject=projectservice.updateProject(projec);
        return new ResponseEntity<>(updateProject, HttpStatus.OK);
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Project>> getProject(){
        List<Project> proje=projectservice.findProject();
        return new ResponseEntity<>(proje, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Project> createProject(@RequestBody Project proje){
        Project newProject = projectservice.addProject(proje);
        return new ResponseEntity<>(newProject, HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{idProject}")
    public ResponseEntity<?> deleteProject(@PathVariable("idProject") Long idProject){
        projectservice.deleteProject(idProject);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
