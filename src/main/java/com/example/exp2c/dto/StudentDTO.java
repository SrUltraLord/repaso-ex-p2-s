package com.example.exp2c.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class StudentDTO {
  private List<CourseDTO> enrolledCourses;

  private String internalId;

  private String name;

  private String email;

  private Integer countryCode;

  private Date birthDate;

  private String state;
}
