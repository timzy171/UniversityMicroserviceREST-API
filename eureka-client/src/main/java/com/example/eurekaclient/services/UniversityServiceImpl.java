package com.example.eurekaclient.services;

import com.example.eurekaclient.documents.University;
import com.example.eurekaclient.repositories.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityServiceImpl implements UniversityService{
    @Autowired
    private UniversityRepository universityRepository;

    @Override
    public University getUniById(String id) {
        return universityRepository.findById(id).get();
    }

    @Override
    public List<University> getUnisByCity(String city) {
        return universityRepository.findAllByCity(city);
    }

    @Override
    public List<University> getUnisByType(String type) {
        return universityRepository.findAllByType(type);
    }

    @Override
    public List<University> getUnisByRegion(String region) {
        return universityRepository.findAllByRegion(region);
    }

    @Override
    public University getUniByEmail(String email) {
        return universityRepository.findByEmail(email);
    }

    @Override
    public University getUniByDirector(String director) {
        return universityRepository.findByDirector(director);
    }

    @Override
    public University getUniByAdmCommEmail(String admEmail) {
        return universityRepository.findByAdmCommEmail(admEmail);
    }

    @Override
    public University getUniByPhoneNumber(String phoneNumber) {
        return universityRepository.findByPhoneNumber(phoneNumber);
    }

    @Override
    public University addUni(University university) {
        universityRepository.insert(university);
        return university;
    }
}
