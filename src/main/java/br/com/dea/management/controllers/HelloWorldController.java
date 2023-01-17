package br.com.dea.management.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = "hello-world")
    public ResponseEntity<String> getFactory(){
        return ResponseEntity.ok("hello world");
    }
}
