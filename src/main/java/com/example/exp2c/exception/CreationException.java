package com.example.exp2c.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class CreationException extends RuntimeException {
  public CreationException(String message) {
    super(message);
  }
}
