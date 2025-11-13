package com.managecv.inventory.service;

import com.managecv.inventory.model.enums.MovementType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.managecv.inventory.model.ProductLot;
import com.managecv.inventory.model.StockMovement;
import com.managecv.inventory.repository.ProductLotRepository;
import com.managecv.inventory.repository.StockMovementRepository;

import java.time.LocalDate;

@Service
public class StockMovementService {

    private final StockMovementRepository stockMovementRepository;
    private final ProductLotRepository productLotRepository;

    public StockMovementService(StockMovementRepository stockMovementRepository,
                                ProductLotRepository productLotRepository) {
        this.stockMovementRepository = stockMovementRepository;
        this.productLotRepository = productLotRepository;
    }

    @Transactional
    public StockMovement registerMovement(Long lotId, Integer quantity,
                                           MovementType movementType, String remark) {

        // Load lot
        ProductLot lot = productLotRepository.findById(lotId)
                .orElseThrow(() -> new RuntimeException("Lote não encontrado: " + lotId));

        // Update stock (allow negative numbers)
        lot.setCurrentQuantity(lot.getCurrentQuantity() + quantity);
        productLotRepository.save(lot);

        // Create movement
        StockMovement movement = new StockMovement();
        movement.setLot(lot);
        movement.setDate(LocalDate.now());
        movement.setQuantity(quantity);
        movement.setMovementType(movementType);
        movement.setRemark(remark);

        return stockMovementRepository.save(movement);
    }
}
