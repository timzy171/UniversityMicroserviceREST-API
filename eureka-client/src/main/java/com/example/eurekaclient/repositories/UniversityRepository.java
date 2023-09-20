package com.example.eurekaclient.repositories;

import com.example.eurekaclient.documents.University;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniversityRepository extends MongoRepository<University,String> {
    List<University> findAllByCity(String city);
    List<University> findAllByType(String type);
    List<University> findAllByRegion(String region);
    University findByEmail(String email);
    University findByDirector(String director);
    University findByAdmCommEmail(String admEmail);
    University findByPhoneNumber(String phoneNumber);
}