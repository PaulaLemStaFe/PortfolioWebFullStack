package com.Portfolio.ApiPortfolio.repository;

import com.Portfolio.ApiPortfolio.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    
}
