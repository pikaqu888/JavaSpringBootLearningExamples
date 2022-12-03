package com.example.CarApplication.service;

import com.example.CarApplication.model.entity.Car;

import java.util.List;

public interface ICarService {
    Car getCarById(Long id);
    List<Car> getAllCars();
    Car createCar(Car car);
}
