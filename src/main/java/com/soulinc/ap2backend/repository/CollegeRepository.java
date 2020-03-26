package com.soulinc.ap2backend.repository;

import com.soulinc.ap2backend.entity.College;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CollegeRepository extends MongoRepository<College, String> {
    College getCollegeByCollege_Id(String college_id);
}
