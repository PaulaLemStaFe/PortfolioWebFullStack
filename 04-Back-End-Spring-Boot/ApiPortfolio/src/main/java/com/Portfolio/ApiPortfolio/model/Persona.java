package com.Portfolio.ApiPortfolio.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPersona;
    private String namePersona;
    private String titlePersona;
    private String imgbannerPersona;
    private String imgprofilePersona;
    private String text01Persona;
    private String text02Persona;
    private String text03Persona;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idCertificate")
    private List<Certificate> certificateList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idComSki")
    private List<ComputerSkill> comskiList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExperience")
    private List<Experience> experienceList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idProject")
    private List<Project> projectList;

    public Persona() {
    }

    public Persona(Long idPersona, String namePersona, String titlePersona, String imgbannerPersona, String imgprofilePersona, String text01Persona, String text02Persona, String text03Persona) {
        this.idPersona = idPersona;
        this.namePersona = namePersona;
        this.titlePersona = titlePersona;
        this.imgbannerPersona = imgbannerPersona;
        this.imgprofilePersona = imgprofilePersona;
        this.text01Persona = text01Persona;
        this.text02Persona = text02Persona;
        this.text03Persona = text03Persona;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getNamePersona() {
        return namePersona;
    }

    public void setNamePersona(String namePersona) {
        this.namePersona = namePersona;
    }

    public String getTitlePersona() {
        return titlePersona;
    }

    public void setTitlePersona(String titlePersona) {
        this.titlePersona = titlePersona;
    }

    public String getImgbannerPersona() {
        return imgbannerPersona;
    }

    public void setImgbannerPersona(String imgbannerPersona) {
        this.imgbannerPersona = imgbannerPersona;
    }

    public String getImgprofilePersona() {
        return imgprofilePersona;
    }

    public void setImgprofilePersona(String imgprofilePersona) {
        this.imgprofilePersona = imgprofilePersona;
    }

    public String getText01Persona() {
        return text01Persona;
    }

    public void setText01Persona(String text01Persona) {
        this.text01Persona = text01Persona;
    }

    public String getText02Persona() {
        return text02Persona;
    }

    public void setText02Persona(String text02Persona) {
        this.text02Persona = text02Persona;
    }

    public String getText03Persona() {
        return text03Persona;
    }

    public void setText03Persona(String text03Persona) {
        this.text03Persona = text03Persona;
    }
    
    
}
