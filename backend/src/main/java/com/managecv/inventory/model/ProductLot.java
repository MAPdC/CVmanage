package com.managecv.inventory.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class ProductLot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private Product product;

    private String lotNumber;
    private Integer harvestYear;
    private Integer currentQuantity;
    private LocalDate productionDate;

    public ProductLot() {}

    public ProductLot(Product product, String lotNumber, Integer harvestYear, Integer currentQuantity, LocalDate productionDate) {
        this.product = product;
        this.lotNumber = lotNumber;
        this.harvestYear = harvestYear;
        this.currentQuantity = currentQuantity;
        this.productionDate = productionDate;
    }

    public Long getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public Integer getHarvestYear() {
        return harvestYear;
    }

    public Integer getCurrentQuantity() {
        return currentQuantity;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public void setHarvestYear(Integer harvestYear) {
        this.harvestYear = harvestYear;
    }

    public void setCurrentQuantity(Integer currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }
}