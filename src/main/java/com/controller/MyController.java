package com.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/aws" )
        public ResponseEntity<String> health () {
            return ResponseEntity.ok("spring boot app runing pn aws ec2 instance");
        }



}
