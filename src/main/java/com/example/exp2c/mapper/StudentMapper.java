package com.example.exp2c.mapper;

import com.example.exp2c.dto.StudentDTO;
import com.example.exp2c.model.Student;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StudentMapper {
  public static Student buildStudent(StudentDTO dto) {
    return Student.builder()
        .internalId(dto.getInternalId())
        .name(dto.getName())
        .email(dto.getEmail())
        .countryCode(dto.getCountryCode())
        .birthDate(dto.getBirthDate())
        .state(dto.getState())
        .build();
  }

  public static StudentDTO buildStudentDTO(Student student) {
    return StudentDTO.builder()
        .internalId(student.getInternalId())
        .name(student.getName())
        .email(student.getEmail())
        .countryCode(student.getCountryCode())
        .birthDate(student.getBirthDate())
        .state(student.getState())
        .build();
  }
}
