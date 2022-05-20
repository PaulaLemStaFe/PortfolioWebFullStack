package com.Portfolio.ApiPortfolio.repository;

import com.Portfolio.ApiPortfolio.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
    
}
