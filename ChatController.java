package com.example.springbootchatbot.controller;

import com.example.springbootchatbot.service.ChatbotEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class ChatController {

    @Autowired
    private ChatbotEngine engine;

    @GetMapping("/chat")
    public String chat(@RequestParam String message) {

        return engine.getResponse(message);
    }
}