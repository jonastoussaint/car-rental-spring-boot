package com.Rental.car_rental_spring.services.auth;

import com.Rental.car_rental_spring.dto.SignupRequest;
import com.Rental.car_rental_spring.dto.UserDto;

public interface AuthService {

   UserDto createCustomer(SignupRequest signupRequest);
   boolean hasCustomerWithEmail(String email);
}
