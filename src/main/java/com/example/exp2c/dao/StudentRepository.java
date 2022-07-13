package com.example.exp2c.dao;

import com.example.exp2c.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface StudentRepository extends MongoRepository<Student, String> {
  Optional<Student> findByInternalId(String internalId);

  Optional<Student> findByEmail(String email);
}
