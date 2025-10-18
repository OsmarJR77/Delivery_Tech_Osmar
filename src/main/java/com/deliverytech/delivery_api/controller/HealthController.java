
// link para testar "http://localhost:8080/health"
// link para testar "http://localhost:8080/info"

package com.deliverytech.delivery_api.controller;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
            "Status: ", "up",
            "Timestamp", LocalDateTime.now().toString(),
            "Service", "Delivery API",
            "javaVersion", System.getProperty("java.version")
        );
    }// fim do health()

    @GetMapping("/info")
    public AppInfo info() {
        return new AppInfo(
            "Delivery Tech",
            "1.0.0",
            "JDK 21",
            "Spring Boot 3.5.6"
        );
    } // fim do appinfo()
    
    public record AppInfo(
        String Application,
        String version,
        String developer,
        String framework
    ) {}

} // fim do HealthController


