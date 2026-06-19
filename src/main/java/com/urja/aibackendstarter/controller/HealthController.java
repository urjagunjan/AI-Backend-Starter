package com.urja.aibackendstarter.controller;

import com.urja.aibackendstarter.dto.HealthResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public HealthResponse health() {
        return new HealthResponse(
                "UP",
                "AI Backend Starter"
        );
    }
}
