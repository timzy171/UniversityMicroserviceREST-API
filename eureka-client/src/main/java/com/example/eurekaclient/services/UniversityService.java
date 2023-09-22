package com.example.eurekaclient.services;

import com.example.eurekaclient.documents.University;

import java.util.List;
import java.util.Map;

public interface UniversityService {
    University getUniById(String id);
    University addUni(University university);
    List<University> getAllUnis();

    List<University> getUnisByParams(Map<String,String> params);
}
