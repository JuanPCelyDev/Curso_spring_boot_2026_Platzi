package com.juan.dev.web.controller;


import com.juan.dev.domain.service.PlataformaPelisAiService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Hello", description = "Endpoint to test the AI integration")
public class HelloController {

    private final String platform;
    private final PlataformaPelisAiService aiService;

    public HelloController(@Value("${spring.application.name}") String platform, PlataformaPelisAiService aiService) {
        this.platform = platform;
        this.aiService = aiService;
    }

    @GetMapping("/hello")
    public String hello(){
        return this.aiService.generateGreeting(platform);
    }
}
