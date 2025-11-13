package com.managecv.inventory.model;

import com.managecv.inventory.model.enums.MovementType;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class StockMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private ProductLot lot;

    private LocalDate date;

    private Integer quantity;

    @Enumerated(EnumType.STRING)
    private MovementType movementType;

    private String remark;

    public StockMovement() {}

    public StockMovement(ProductLot lot, LocalDate date, Integer quantity, MovementType movementType, String remark) {
        this.lot = lot;
        this.date = date;
        this.quantity = quantity;
        this.movementType = movementType;
        this.remark = remark;
    }

    public Long getId() {
        return id;
    }

    public ProductLot getLot() {
        return lot;
    }

    public LocalDate getDate() {
        return date;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public MovementType getMovementType() {
        return movementType;
    }

    public String getRemark() {
        return remark;
    }

    public void setLot(ProductLot lot) {
        this.lot = lot;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setMovementType(MovementType movementType) {
        this.movementType = movementType;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
