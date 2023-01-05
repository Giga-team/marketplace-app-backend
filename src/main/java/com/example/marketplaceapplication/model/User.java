package com.example.marketplaceapplication.model;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class User {
  private Long id;
  private String firstName;
  private String lastName;
  private BigDecimal amount;
}
