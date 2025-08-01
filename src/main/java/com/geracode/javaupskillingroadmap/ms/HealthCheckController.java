package com.geracode.javaupskillingroadmap.ms;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "System", description = "Endpoints de verificación del sistema")
@RestController
public class HealthCheckController {

    @Operation(
            summary = "Verify if the microservice is running",
            tags = "System",
            description = "the microservice is running and healthy",
            responses = {
                    @ApiResponse(responseCode = "200", description = "the microservice is running and healthy"),
            }
    )
    @GetMapping("/health")
    public String healthCheck() {
        return "✅ Microservice is up and running!";
    }
}