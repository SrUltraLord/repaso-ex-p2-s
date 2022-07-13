package com.example.exp2c.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Document(collection = "courses")
@TypeAlias("courses")
@Data
@Builder
public class Course {
  @Id private String id;

  @Indexed(name = "idxu_courses_internalId", unique = true)
  private String internalId;

  private String code;

  private String area;

  private String name;

  private Integer durationInHours;

  private Date startDate;

  private BigDecimal price;
}
