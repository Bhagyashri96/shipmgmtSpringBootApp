package com.example.demo.manager;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.jpaRepo.CarRepo;
import com.example.demo.pojo.Car;

@Service
public class CarService implements CarServiceIfc {
	
	@Autowired
	CarRepo dao;

	@Override
	public Car saveCar(Car car) {
		// TODO Auto-generated method stub
		return dao.save(car);
	}

	@Override
	public List<Car> findAllCar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Car getCar(Integer id) {
		// TODO Auto-generated method stub
		Optional<Car>oCar=dao.findById(id);
		return oCar.get();
	}

}
