package com.example.eurekaclient.controllers;

import com.example.eurekaclient.documents.University;
import com.example.eurekaclient.services.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
    @Autowired
    private UniversityService universityService;

    @GetMapping("/find")
    public University getUniById(@RequestParam(name = "id") String id){
        return universityService.getUniById(id);
    }
}
