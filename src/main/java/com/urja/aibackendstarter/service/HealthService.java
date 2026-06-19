package com.urja.aibackendstarter.service;

import com.urja.aibackendstarter.dto.HealthResponse;
import org.springframework.stereotype.Service;

@Service
public class HealthService {

    public HealthResponse getHealth() {
        return new HealthResponse(
                "UP",
                "ai-backend-starter"
        );
    }
}
