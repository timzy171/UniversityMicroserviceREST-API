package com.example.eurekaclient.services;

import com.example.eurekaclient.documents.University;
import com.example.eurekaclient.repositories.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UniversityServiceImpl implements UniversityService{
    @Autowired
    private UniversityRepository universityRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public University getUniById(String id) {
        return universityRepository.findById(id).get();
    }

    @Override
    public University addUni(University university) {
        universityRepository.insert(university);
        return university;
    }

    @Override
    public List<University> getAllUnis(){
        return universityRepository.findAll();
    }

    @Override
    public List<University> getUnisByParams(Map<String, String> params) {
        Query query = new Query();
        int i = 0;
        for(String key : params.keySet()){
            query.addCriteria(Criteria.where(key).regex((String) params.values().toArray()[i],"i"));
            ++i;
        }

        return mongoTemplate.find(query,University.class);
    }
}
