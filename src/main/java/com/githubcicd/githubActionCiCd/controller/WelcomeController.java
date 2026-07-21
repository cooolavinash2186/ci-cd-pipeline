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

    @GetMapping("/users")
    ResponseEntity<Map<String,Object>> getUser(){

        return  ResponseEntity.ok(Map.of("name","Ci cd automated succufully of ","aws",true));
    }

    @GetMapping("/evn")
    public Integer evenNumbers() {

        int num = 1223465;
        int sum = 0;
        while( num > 0){
            int ld = num % 10 ;
            if(ld % 2 == 0)
            {
                sum = sum + ld ;
            }
            num = num / 10;
        }

        return sum;

    }



}
