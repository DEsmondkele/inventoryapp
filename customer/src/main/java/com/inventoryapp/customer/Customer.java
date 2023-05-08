package com.inventoryapp.customer;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Id;

@Data
@Builder
public class Customer {
    @Id
private Integer id;
private String firstName;
private String lastName;
private String email;
}
