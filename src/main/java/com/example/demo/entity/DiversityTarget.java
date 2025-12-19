package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "diversity_targets")
public class DiversityTarget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer targetYear;

    private Double targetPercentage;

    @ManyToOne
    private DiversityClassification classification;

    private Boolean active;

    public DiversityTarget() {}

    @PrePersist
    public void prePersist() {
        preSave();
    }

    public void preSave() {
    if (active == null) active = true;
    }


    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getTargetYear() { return targetYear; }
    public void setTargetYear(Integer targetYear) { this.targetYear = targetYear; }

    public Double getTargetPercentage() { return targetPercentage; }
    public void setTargetPercentage(Double targetPercentage) { this.targetPercentage = targetPercentage; }

    public DiversityClassification getClassification() { return classification; }
    public void setClassification(DiversityClassification classification) {
        this.classification = classification;
    }

    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
}
