package com.example.demo.Restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.manager.CarServiceIfc;
import com.example.demo.pojo.Car;

@RestController
@RequestMapping("/CarOperation")
public class Restcontroller {
	
	@Autowired
	CarServiceIfc serviceifc;
	
	@RequestMapping
	public String getMessage() {
		return "RestControllerStringMsg";
	}
	
	@PostMapping("/saveCar")
	public Car saveCar(@RequestBody Car car) {
		return serviceifc.saveCar(car);
	}

	@GetMapping("/findAllCar")
	public List<Car> findAllCar() {
		 return serviceifc.findAllCar();
	}
	
	@GetMapping("/getCar/{id}")
	public Car getCar(@PathVariable Integer id) {
		return serviceifc.getCar(id);
	}
}
