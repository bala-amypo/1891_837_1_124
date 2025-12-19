package com.example.demo.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "purchase_orders")
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String poNumber;

    @ManyToOne
    private Supplier supplier;

    @ManyToOne
    private SpendCategory category;

    private BigDecimal amount;

    private LocalDate dateIssued;

    private String approvedBy;
    private String notes;

    public PurchaseOrder() {}

    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPoNumber() { return poNumber; }
    public void setPoNumber(String poNumber) { this.poNumber = poNumber; }

    public Supplier getSupplier() { return supplier; }
    public void setSupplier(Supplier supplier) { this.supplier = supplier; }

    public SpendCategory getCategory() { return category; }
    public void setCategory(SpendCategory category) { this.category = category; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public LocalDate getDateIssued() { return dateIssued; }
    public void setDateIssued(LocalDate dateIssued) { this.dateIssued = dateIssued; }

    public String getApprovedBy() { return approvedBy; }
    public void setApprovedBy(String approvedBy) { this.approvedBy = approvedBy; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
}
