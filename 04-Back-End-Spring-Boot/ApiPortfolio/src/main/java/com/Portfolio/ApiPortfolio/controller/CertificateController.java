package com.Portfolio.ApiPortfolio.controller;

import com.Portfolio.ApiPortfolio.model.Certificate;
import com.Portfolio.ApiPortfolio.service.CertificateService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/certificate")
public class CertificateController {
    
    private final CertificateService certificateService;
    
    public CertificateController(CertificateService certificateService){
        this.certificateService = certificateService;
    }
    
    @PutMapping("/edit/{idCertificate}")
    public ResponseEntity<?> editCertificate(@PathVariable("idCertificate") Long idCertificate,
                                             @RequestBody Certificate certificate) {
        
        Certificate editCertificate = certificateService.getIdCertificate(idCertificate);
        
        editCertificate.setImgCertificate(certificate.getImgCertificate());
        editCertificate.setTitleCertificate(certificate.getTitleCertificate());
        editCertificate.setObtainedCertificate(certificate.getObtainedCertificate());
        
        certificateService.addCertificate(certificate);
        return new ResponseEntity<>(editCertificate, HttpStatus.OK);
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Certificate>> getCertificate(){
        List<Certificate> certificates = certificateService.findCertificate();
        return new ResponseEntity<>(certificates, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Certificate> createCertificate(@RequestBody Certificate certifica){
        Certificate newCertificate = certificateService.addCertificate(certifica);
        return new ResponseEntity<>(newCertificate, HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{idCertificate}")
    public ResponseEntity<?> deleteCertificate(@PathVariable("idCertificate") Long idCertificate){
        certificateService.deleteCertificate(idCertificate);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
