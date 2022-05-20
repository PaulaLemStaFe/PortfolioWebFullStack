package com.Portfolio.ApiPortfolio.service;

import com.Portfolio.ApiPortfolio.exception.CertificateNotFoundException;
import com.Portfolio.ApiPortfolio.model.Certificate;
import com.Portfolio.ApiPortfolio.repository.CertificateRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CertificateService {
    
    private final CertificateRepository certificateRepo;
    
    @Autowired
    public CertificateService(CertificateRepository certificateRepo) {
        this.certificateRepo = certificateRepo;
    }
    
    public Certificate addCertificate(Certificate certificate) {
        return certificateRepo.save(certificate);
    }
    
    public List<Certificate> findCertificate(){
        return certificateRepo.findAll();
    }
    
    public Certificate getIdCertificate(Long idCertificate) {
        return certificateRepo.findById(idCertificate).orElseThrow(() -> new CertificateNotFoundException("Certificado No Encontrado"));
    }
    
    public Certificate editCertificate(Certificate certificat){
        return certificateRepo.save(certificat);
    }
    
    public void deleteCertificate(Long idCertificate){
        certificateRepo.deleteById(idCertificate);
    }
    
}
