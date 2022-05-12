package com.lottery.lottery.rest.controller;

import com.lottery.lottery.rest.service.RandomNumberGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/random-number-generator")
@CrossOrigin(origins = "http://localhost:4200")
public class RandomNumberGeneratorController {

    @Autowired
    private RandomNumberGeneratorService randomNumberGeneratorService;

    @GetMapping("/{length}")
    public Set<Integer> getGeneratedRandomNumbers(@PathVariable int length) {
        return randomNumberGeneratorService.getGeneratedRandomNumbers(length);
    }
}
