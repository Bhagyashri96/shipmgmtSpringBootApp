package com.example.demo.manager;

import java.util.List;

import com.example.demo.pojo.Car;

public interface CarServiceIfc {
	
	public Car saveCar(Car car);

	public List<Car> findAllCar();

	public Car getCar(Integer id);

}