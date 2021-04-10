package com.braintrain.real.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileLoadController {

    @GetMapping("/getFileName")
    public ResponseEntity<String> getFileName(){
        return ResponseEntity.ok().body("New File");
    }

}
