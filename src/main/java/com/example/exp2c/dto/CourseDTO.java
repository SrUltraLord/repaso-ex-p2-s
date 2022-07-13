package com.example.exp2c.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
public class CourseDTO {
  private String internalId;

  private String code;

  private String area;

  private String name;

  private Integer durationInHours;

  private Date startDate;

  private BigDecimal price;
}
