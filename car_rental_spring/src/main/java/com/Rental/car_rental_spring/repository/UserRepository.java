package com.Rental.car_rental_spring.repository;

import com.Rental.car_rental_spring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

    Optional<User> findFirstByEmail(String email);
}

