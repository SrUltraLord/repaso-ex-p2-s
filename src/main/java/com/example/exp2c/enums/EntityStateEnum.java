package com.example.exp2c.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum EntityStateEnum {
  ACTIVE("ACT", "Active"),
  INACTIVE("INA", "Inactive");

  private final String value;
  private final String text;
}
