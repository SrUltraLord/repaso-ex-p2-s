package com.example.exp2c.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.Date;
import java.util.List;

@Document(collection = "students")
@TypeAlias("students")
@Data
@Builder
public class Student {
  @Id private String id;

  @DocumentReference private List<Course> enrolledCourses;

  @Indexed(name = "idxu_students_internalId", unique = true)
  private String internalId;

  private String name;

  @Indexed(name = "idxu_students_email", unique = true)
  private String email;

  private Integer countryCode;

  private Date birthDate;

  private Date creationDate;

  private String state;
}
