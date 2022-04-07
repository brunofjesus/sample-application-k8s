package pt.brunojesus.samplebackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.brunojesus.samplebackend.model.Fact;
import pt.brunojesus.samplebackend.service.FactService;

@RestController
public class FactController {

    private final FactService factService;

    @Autowired
    public FactController(FactService factService) {
        this.factService = factService;
    }

    @GetMapping("/fact/random")
    public ResponseEntity<Fact> randomFact() {
        return ResponseEntity.ok(
                factService.randomFact()
        );
    }
}
