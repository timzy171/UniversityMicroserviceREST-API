package com.example.eurekaclient.repositories;

import com.example.eurekaclient.documents.University;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends MongoRepository<University,String> {
}