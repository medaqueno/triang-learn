package com.triangulant.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListAccommodationsController {
    @GetMapping(value = "hello/{requestedId}")
    public ResponseEntity<Object> getHello(@PathVariable Long requestedId) {
        CashCard cashCard = new CashCard(requestedId, 123.45);
        ApiResponseOk<CashCard> apiResponseOk = new ApiResponseOk<CashCard>("ok", "valechato", cashCard);
        return ResponseEntity.ok(apiResponseOk);
    }
}
