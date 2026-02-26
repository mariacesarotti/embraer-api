package com.mariacesarotti.embraer_api.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mariacesarotti.embraer_api.dto.CalculationRequest;

@Service
public class CalculationService {

    public Integer calculateMaxPassengers(CalculationRequest request) {

        if (request == null ||
            request.getN() == null ||
            request.getE() == null ||
            request.getS() == null) {
            throw new IllegalArgumentException("Invalid data input.");
        }

        if (request.getE().size() != request.getN() ||
            request.getS().size() != request.getN()) {
            throw new IllegalArgumentException("List must have the same size as N.");
        }

        List<Integer> E = request.getE();
        List<Integer> S = request.getS();

        Collections.sort(E);
        Collections.sort(S);

        int i = 0;
        int j = 0;
        int currentPassengers = 0;
        int maxPassengers = 0;

        while (i < E.size() && j < S.size()) {
            if (E.get(i) < S.get(j)) {
                currentPassengers++;
                maxPassengers = Math.max(maxPassengers, currentPassengers);
                i++;
            } else {
                currentPassengers--;
                j++;
            }
        }

        return maxPassengers;
    }
}
