package com.mariacesarotti.embraer_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mariacesarotti.embraer_api.dto.CalculationRequest;
import com.mariacesarotti.embraer_api.dto.CalculationResponse;
import com.mariacesarotti.embraer_api.service.CalculationService;

@RestController
@RequestMapping("/api/capacity")
public class CalculationController {

    private final CalculationService calculationService;

    public CalculationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @PostMapping
    public ResponseEntity<CalculationResponse> calculate(
            @RequestBody CalculationRequest request) {

        Integer result = calculationService.calculateMaxPassengers(request);

        CalculationResponse response = new CalculationResponse(result);

        return ResponseEntity.ok(response);
    }
}
