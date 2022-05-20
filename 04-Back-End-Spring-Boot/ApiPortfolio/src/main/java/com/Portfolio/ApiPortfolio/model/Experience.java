package com.Portfolio.ApiPortfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExperience;
    private String EnterpriseExperience;
    private String DateTitleExperience;
    private String DateExperience;
    private String PositionExperience;
    private String DescriptionExperience;

    public Experience() {
    }

    public Experience(Long idExperience, String EnterpriseExperience, String DateTitleExperience, String DateExperience, String PositionExperience, String DescriptionExperience) {
        this.idExperience = idExperience;
        this.EnterpriseExperience = EnterpriseExperience;
        this.DateTitleExperience = DateTitleExperience;
        this.DateExperience = DateExperience;
        this.PositionExperience = PositionExperience;
        this.DescriptionExperience = DescriptionExperience;
    }

    public Long getIdExperience() {
        return idExperience;
    }

    public void setIdExperience(Long idExperience) {
        this.idExperience = idExperience;
    }

    public String getEnterpriseExperience() {
        return EnterpriseExperience;
    }

    public void setEnterpriseExperience(String EnterpriseExperience) {
        this.EnterpriseExperience = EnterpriseExperience;
    }

    public String getDateTitleExperience() {
        return DateTitleExperience;
    }

    public void setDateTitleExperience(String DateTitleExperience) {
        this.DateTitleExperience = DateTitleExperience;
    }

    public String getDateExperience() {
        return DateExperience;
    }

    public void setDateExperience(String DateExperience) {
        this.DateExperience = DateExperience;
    }

    public String getPositionExperience() {
        return PositionExperience;
    }

    public void setPositionExperience(String PositionExperience) {
        this.PositionExperience = PositionExperience;
    }

    public String getDescriptionExperience() {
        return DescriptionExperience;
    }

    public void setDescriptionExperience(String DescriptionExperience) {
        this.DescriptionExperience = DescriptionExperience;
    }
    
    
}
