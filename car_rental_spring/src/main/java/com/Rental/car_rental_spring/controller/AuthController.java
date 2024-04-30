package com.Rental.car_rental_spring.controller;

import com.Rental.car_rental_spring.dto.SignupRequest;
import com.Rental.car_rental_spring.dto.UserDto;
import com.Rental.car_rental_spring.services.auth.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController// handles rest api
@RequestMapping("/api/auth")//Specifies the base url path for all end points in this controller
@RequiredArgsConstructor

//This class is a controller responsible for handling authentication-related HTTP requests.
public class AuthController {

    // This field will be initialized through constructor injection
    // and is used to delegate authentication-related operations to the AuthService.
    private final AuthService authService;

    //defines post end point at the '/api/auth/signup'
    @PostMapping("/signup")
    public ResponseEntity<?> signupCustomer(@RequestBody SignupRequest signupRequest){

        //This line calls the createCustomer method of the authService object, passing the signupRequest object as an argument.
        // This method presumably creates a new customer based on the provided signup information and
        // returns a UserDto object representing the created customer.
        UserDto createdCustomerDto = authService.createCustomer(signupRequest);
        //This line checks if the createdCustomerDto is null. If it's null, it means that the customer creation was unsuccessful.
        //In this case, it returns a ResponseEntity with a string message indicating that the customer was not created
        // and an HTTP status code of 400 (Bad Request).
        if (createdCustomerDto == null) return new ResponseEntity<>("Customer not created, Come again later", HttpStatus.BAD_REQUEST);

        //returns a ResponseEntity containing the createdCustomerDto object representing the newly created customer
        // and an HTTP status code of 201 (Created).
        return new ResponseEntity<>(createdCustomerDto, HttpStatus.CREATED);

    }
}
