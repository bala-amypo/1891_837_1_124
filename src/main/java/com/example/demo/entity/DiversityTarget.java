package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
public class DiversityTarget {

    @Id
    private Long id;

    private Integer targetYear;

    @ManyToOne
    private DiversityClassification classification;

    @Min(0)
    @Max(100)
    private Double targetPercentage;

    private Boolean active = true;

    /* Getters and Setters */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer gettargetYear() {
        return targetYear;
    }

    public void settargetYear(Integer targetYear) {
        this.targetYear = targetYear;
    }

    public DiversityClassification getclassification() {
        return classification;
    }

    public void setclassification(DiversityClassification classification) {
        this.classification = classification;
    }

    public Double gettargetPercentage() {
        return targetPercentage;
    }

    public void settargetPercentage(Double targetPercentage) {
        this.targetPercentage = targetPercentage;
    }

    public Boolean getactive() {
        return active;
    }

    public void setactive(Boolean active) {
        this.active = active;
    }

    /* Constructors */

    public DiversityTarget(Long id, Integer targetYear,
                           DiversityClassification classification,
                           Double targetPercentage, Boolean active) {
        this.id = id;
        this.targetYear = targetYear;
        this.classification = classification;
        this.targetPercentage = targetPercentage;
        this.active = active;
    }

    public DiversityTarget() {
    }
}
