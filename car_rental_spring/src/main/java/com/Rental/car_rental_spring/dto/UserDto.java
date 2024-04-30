package com.Rental.car_rental_spring.dto;

import lombok.Data;
@Data
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private UserDto userDto;
}
