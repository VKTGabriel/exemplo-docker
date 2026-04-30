package br.dev.vktgabriel.exemplodocker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ExemploController {

    @GetMapping
    public ResponseEntity<String> testeGet() {
        return ResponseEntity.ok("teste docker");
    }
}
