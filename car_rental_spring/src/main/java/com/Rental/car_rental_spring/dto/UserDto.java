package com.Rental.car_rental_spring.dto;

import lombok.Data;
//Used for transfering data between different layers of application or between client and server
@Data
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private UserDto userDto;
}
