package com.example.demo.jpaRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojo.Car;

public interface CarRepo extends JpaRepository<Car, Integer> {

}
