package com.managecv.inventory.controller;

import com.managecv.inventory.model.enums.MovementType;
import org.springframework.web.bind.annotation.*;

import com.managecv.inventory.model.StockMovement;
import com.managecv.inventory.service.StockMovementService;

@RestController
@RequestMapping("/activity")
@CrossOrigin(origins = "*")
public class StockMovementController {

    private final StockMovementService service;

    public StockMovementController(StockMovementService service) {
        this.service = service;
    }

    @PostMapping
    public StockMovement createMovement(@RequestBody MovementRequest dto) {
        return service.registerMovement(
                dto.lotId,
                dto.quantity,
                dto.movementType,
                dto.remark
        );
    }

    public static class MovementRequest {
        public Long lotId;
        public Integer quantity;
        public MovementType movementType;
        public String remark;
    }
}
