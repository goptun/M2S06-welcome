package org.senai.m2s06.welcome.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    public String createMessage(String name) {
        if (name != null && !name.isEmpty()) {
            return String.format("Bem vindo %s!", name);
        }
        return "O nome não pode ser vazio.";
    }
}
