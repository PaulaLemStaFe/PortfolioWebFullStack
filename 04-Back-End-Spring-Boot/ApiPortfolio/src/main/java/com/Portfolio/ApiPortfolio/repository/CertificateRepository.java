package com.Portfolio.ApiPortfolio.repository;

import com.Portfolio.ApiPortfolio.model.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificateRepository extends JpaRepository<Certificate, Long> {
    
}
