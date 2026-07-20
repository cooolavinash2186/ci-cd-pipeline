package com.githubcicd.githubActionCiCd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {

    @GetMapping
    ResponseEntity<String> welcome (){
        return ResponseEntity.ok("Welcome to spring boot app");
    }

    @GetMapping
    ResponseEntity<Map<String,Object>> getUser(){
        return  ResponseEntity.ok(Map.of("name","Ci cd automated succufully of ","aws",true));
    }
}
