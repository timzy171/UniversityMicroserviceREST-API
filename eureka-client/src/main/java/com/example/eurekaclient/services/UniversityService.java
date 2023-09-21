package com.example.eurekaclient.services;

import com.example.eurekaclient.documents.University;

import java.util.List;

public interface UniversityService {
    University getUniById(String id);
    List<University> getUnisByCity(String city);
    List<University> getUnisByType(String type);
    List<University> getUnisByRegion(String region);
    University getUniByEmail(String email);
    University getUniByDirector(String director);
    University getUniByAdmCommEmail(String admEmail);
    University getUniByPhoneNumber(String phoneNumber);
    University addUni(University university);

}
