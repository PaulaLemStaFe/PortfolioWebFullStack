package com.Portfolio.ApiPortfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProject;
    private String imgProject;
    private String titleProject;
    private String textProject;
    private String btn01enlaceProject;
    private String btn01textProject;
    private String btn02enlaceProject;
    private String btn02textProject;

    public Project() {
    }

    public Project(Long idProject, String imgProject, String titleProject, String textProject, String btn01enlaceProject, String btn01textProject, String btn02enlaceProject, String btn02textProject) {
        this.idProject = idProject;
        this.imgProject = imgProject;
        this.titleProject = titleProject;
        this.textProject = textProject;
        this.btn01enlaceProject = btn01enlaceProject;
        this.btn01textProject = btn01textProject;
        this.btn02enlaceProject = btn02enlaceProject;
        this.btn02textProject = btn02textProject;
    }

    public Long getIdProject() {
        return idProject;
    }

    public void setIdProject(Long idProject) {
        this.idProject = idProject;
    }

    public String getImgProject() {
        return imgProject;
    }

    public void setImgProject(String imgProject) {
        this.imgProject = imgProject;
    }

    public String getTitleProject() {
        return titleProject;
    }

    public void setTitleProject(String titleProject) {
        this.titleProject = titleProject;
    }

    public String getTextProject() {
        return textProject;
    }

    public void setTextProject(String textProject) {
        this.textProject = textProject;
    }

    public String getBtn01enlaceProject() {
        return btn01enlaceProject;
    }

    public void setBtn01enlaceProject(String btn01enlaceProject) {
        this.btn01enlaceProject = btn01enlaceProject;
    }

    public String getBtn01textProject() {
        return btn01textProject;
    }

    public void setBtn01textProject(String btn01textProject) {
        this.btn01textProject = btn01textProject;
    }

    public String getBtn02enlaceProject() {
        return btn02enlaceProject;
    }

    public void setBtn02enlaceProject(String btn02enlaceProject) {
        this.btn02enlaceProject = btn02enlaceProject;
    }

    public String getBtn02textProject() {
        return btn02textProject;
    }

    public void setBtn02textProject(String btn02textProject) {
        this.btn02textProject = btn02textProject;
    }
    
    
}
