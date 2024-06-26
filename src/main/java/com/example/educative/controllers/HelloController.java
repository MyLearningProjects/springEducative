package com.example.educative.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
public class HelloController {
    
    @GetMapping("hello")
    public String hello(){
        return "hello";
    }

    @PostMapping("greeting")
    public ResponseEntity<String> greet( @RequestParam(name = "name") String name){
        return ResponseEntity.ok().body("hello  "  +name);
    }
}
