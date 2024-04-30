package com.Rental.car_rental_spring.entity;

import com.Rental.car_rental_spring.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

//Annotations for mysql
@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private UserRole userRole;
    private String password;
}
