package com.example.exp2c.service;

import com.example.exp2c.dao.StudentRepository;
import com.example.exp2c.exception.CreationException;
import com.example.exp2c.exception.NotFoundException;
import com.example.exp2c.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class StudentService {
  private final StudentRepository studentRepository;

  public Student create(Student student) {
    studentRepository
        .findByEmail(student.getEmail())
        .ifPresent(
            s -> {
              throw new CreationException("Ya existe un usuario con el correo " + s.getEmail());
            });

    student.setCreationDate(new Date());

    return studentRepository.save(student);
  }

  public Student findByInternalId(String internalId) {
    return studentRepository
        .findByInternalId(internalId)
        .orElseThrow(
            () ->
                new NotFoundException("No se ha encontrado un estudiante con el id " + internalId));
  }
}
