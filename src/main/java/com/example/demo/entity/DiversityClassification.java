package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class DiversityClassification {

    @Id
    private Long id;

    @Column(unique = true)
    private String code;

    private String description;

    private Boolean active = true;

    /* Getters and Setters */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getcode() {
        return code;
    }

    public void setcode(String code) {
        this.code = code;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public Boolean getactive() {
        return active;
    }

    public void setactive(Boolean active) {
        this.active = active;
    }

    /* Constructors */

    public DiversityClassification(Long id, String code, String description, Boolean active) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.active = active;
    }

    public DiversityClassification() {
    }
}
