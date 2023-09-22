package com.example.eurekaclient.controllers;

import com.example.eurekaclient.documents.University;
import com.example.eurekaclient.services.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class APIController {
    @Autowired
    private UniversityService universityService;

    @GetMapping("/find/{id}")
    public University getUniById(@PathVariable(name = "id") String id){
        return universityService.getUniById(id);
    }

    @PostMapping("/add")
    public University addUni(@RequestBody University university){
        return universityService.addUni(university);
    }

    @GetMapping("/find")
    @ResponseBody
    public List<University> getUnisByParams(@RequestParam Map<String,String> allParams){
        return universityService.getUnisByParams(allParams);
    }

    @GetMapping("/find/all")
    public List<University> getAllUnis(){
        return universityService.getAllUnis();
    }
}
