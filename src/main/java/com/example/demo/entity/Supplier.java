package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Supplier {

    @Id
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(unique = true)
    private String registrationNumber;

    @Column(unique = true, nullable = false)
    private String email;

    private String phone;
    private String address;

    @ManyToMany
    private List<DiversityClassification> diversityClassifications;

    private Boolean isActive = true;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    /* Getters and Setters */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getregistrationNumber() {
        return registrationNumber;
    }

    public void setregistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public List<DiversityClassification> getdiversityClassifications() {
        return diversityClassifications;
    }

    public void setdiversityClassifications(List<DiversityClassification> diversityClassifications) {
        this.diversityClassifications = diversityClassifications;
    }

    public Boolean getisActive() {
        return isActive;
    }

    public void setisActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public LocalDateTime getcreatedAt() {
        return createdAt;
    }

    public LocalDateTime getupdatedAt() {
        return updatedAt;
    }

    public void setupdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /* Constructors */

    public Supplier(Long id, String name, String registrationNumber, String email,
                    String phone, String address,
                    List<DiversityClassification> diversityClassifications,
                    Boolean isActive) {
        this.id = id;
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.diversityClassifications = diversityClassifications;
        this.isActive = isActive;
    }

    public Supplier() {
    }
}
