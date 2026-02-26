package com.mariacesarotti.embraer_api.service;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.mariacesarotti.embraer_api.dto.CalculationRequest;

class CalculationServiceTest {

    private final CalculationService service = new CalculationService();

    @Test
    @DisplayName("Deve calcular lotação máxima de 3 pessoas - Exemplo 1")
    void shouldCalculateMaxOccupancyExample1() {
        CalculationRequest request = new CalculationRequest();
        request.setN(3);
        request.setE(Arrays.asList(1, 5, 7));
        request.setS(Arrays.asList(9, 13, 12));

        int result = service.calculateMaxPassengers(request);

        assertEquals(3, result, "A lotação máxima deveria ser 3");
    }

    @Test
    @DisplayName("Deve calcular lotação máxima de 1 pessoa - Exemplo 2")
    void shouldCalculateMaxOccupancyExample2() {
        CalculationRequest request = new CalculationRequest();
        request.setN(4);
        request.setE(Arrays.asList(1, 4, 8, 10));
        request.setS(Arrays.asList(3, 8, 10, 17));

        int result = service.calculateMaxPassengers(request);

        assertEquals(1, result, "A lotação máxima deveria ser 1");
    }

    @Test
    @DisplayName("Deve retornar zero se não houver passageiros")
    void shouldReturnZeroForEmptyLists() {
        CalculationRequest request = new CalculationRequest();
        request.setN(0);
        request.setE(Arrays.asList());
        request.setS(Arrays.asList());

        int result = service.calculateMaxPassengers(request);

        assertEquals(0, result);
    }
}
