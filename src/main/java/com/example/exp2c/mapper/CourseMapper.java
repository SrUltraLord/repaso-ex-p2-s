package com.example.exp2c.mapper;

import com.example.exp2c.dto.CourseDTO;
import com.example.exp2c.model.Course;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CourseMapper {
  public static Course buildCourse(CourseDTO dto) {
    return Course.builder()
        .internalId(dto.getInternalId())
        .code(dto.getCode())
        .area(dto.getArea())
        .name(dto.getName())
        .durationInHours(dto.getDurationInHours())
        .startDate(dto.getStartDate())
        .price(dto.getPrice())
        .build();
  }

  public static CourseDTO buildCourseDTO(Course course) {
    return CourseDTO.builder()
        .internalId(course.getInternalId())
        .code(course.getCode())
        .area(course.getArea())
        .name(course.getName())
        .durationInHours(course.getDurationInHours())
        .startDate(course.getStartDate())
        .price(course.getPrice())
        .build();
  }
}
