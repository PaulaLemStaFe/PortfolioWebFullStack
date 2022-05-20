package com.Portfolio.ApiPortfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ComputerSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idComSki;
    private String titleComSki;
    private String imgComSki;

    public ComputerSkill() {
    }

    public ComputerSkill(Long idComSki, String titleComSki, String imgComSki) {
        this.idComSki = idComSki;
        this.titleComSki = titleComSki;
        this.imgComSki = imgComSki;
    }

    public Long getIdComSki() {
        return idComSki;
    }

    public void setIdComSki(Long idComSki) {
        this.idComSki = idComSki;
    }

    public String getTitleComSki() {
        return titleComSki;
    }

    public void setTitleComSki(String titleComSki) {
        this.titleComSki = titleComSki;
    }

    public String getImgComSki() {
        return imgComSki;
    }

    public void setImgComSki(String imgComSki) {
        this.imgComSki = imgComSki;
    }
    
    
}
