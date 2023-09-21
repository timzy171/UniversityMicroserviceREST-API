package com.example.eurekaclient.controllers;

import com.example.eurekaclient.documents.University;
import com.example.eurekaclient.services.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class APIController {
    @Autowired
    private UniversityService universityService;

    @GetMapping("/find")
    public University getUniById(@RequestParam(name = "id") String id){
        return universityService.getUniById(id);
    }

    @PostMapping("/add")
    public University addUni(@RequestBody University university){
        return universityService.addUni(university);
    }
}
