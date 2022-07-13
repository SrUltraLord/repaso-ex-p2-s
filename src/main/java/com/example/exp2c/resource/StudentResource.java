package com.example.exp2c.resource;

import com.example.exp2c.dto.StudentDTO;
import com.example.exp2c.mapper.StudentMapper;
import com.example.exp2c.model.Student;
import com.example.exp2c.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentResource {
  private final StudentService studentService;

  @GetMapping("/{internalId}")
  public ResponseEntity<StudentDTO> findByInternalId(@PathVariable String internalId) {
    Student student = studentService.findByInternalId(internalId);
    return ResponseEntity.ok(StudentMapper.buildStudentDTO(student));
  }

  @PostMapping
  public ResponseEntity<StudentDTO> create(@RequestBody StudentDTO dto) {
    Student createdStudent = studentService.create(StudentMapper.buildStudent(dto));
    return ResponseEntity.ok(StudentMapper.buildStudentDTO(createdStudent));
  }
}
