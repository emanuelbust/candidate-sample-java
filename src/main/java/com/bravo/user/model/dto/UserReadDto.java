package com.bravo.user.model.dto;

import java.time.LocalDateTime;

import com.bravo.user.dao.model.Role;
import lombok.Data;

@Data
public class UserReadDto {

  private String id;
  private String name;
  private String firstName;
  private String middleName;
  private String lastName;
  private String phoneNumber;
  private LocalDateTime updated;
  private String email;
  private Role role;
}
