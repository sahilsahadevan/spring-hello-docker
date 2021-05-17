package com.example.sahil.docker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {

    @GetMapping(path = "/hello")
    public ResponseEntity<HttpStatus> get(){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
