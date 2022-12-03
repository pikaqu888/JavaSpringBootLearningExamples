package com.example.CarApplication.service.impl;

import com.example.CarApplication.model.entity.Car;
import com.example.CarApplication.repository.CarRepository;
import com.example.CarApplication.service.ICarService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CarService implements ICarService {

    private CarRepository carRepository;

    @Override
    public Car getCarById(Long id) {
        return carRepository.findById(id).get();
    }

    @Override
    public List<Car> getAllCars() {
        List<Car> listCars = new ArrayList<>();
        carRepository.findAll().forEach(listCars::add);
        return listCars;
    }

    @Override
    public Car createCar(Car car) {
        return carRepository.save(car);
    }
}
