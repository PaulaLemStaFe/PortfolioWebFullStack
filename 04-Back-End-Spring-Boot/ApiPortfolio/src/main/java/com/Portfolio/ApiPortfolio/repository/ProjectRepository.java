package com.Portfolio.ApiPortfolio.repository;

import com.Portfolio.ApiPortfolio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    
}
