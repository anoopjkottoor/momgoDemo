package com.anoop.mongoTest.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.anoop.mongoTest.model.institution;


@Repository
public interface repository extends MongoRepository<institution, String> {
	
}
