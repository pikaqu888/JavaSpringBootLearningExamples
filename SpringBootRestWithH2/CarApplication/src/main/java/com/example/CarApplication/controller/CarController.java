package com.example.CarApplication.controller;

import com.example.CarApplication.model.entity.Car;
import com.example.CarApplication.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private ICarService carService;

    @GetMapping("/car/{id}")
    ResponseEntity<Car> getCarById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(carService.getCarById(id));
    }

    @GetMapping("/car")
    ResponseEntity<List<Car>> getAllCars() {
        return ResponseEntity.status(HttpStatus.OK).body(carService.getAllCars());
    }

    @PostMapping("/car")
    ResponseEntity<Car> createCar(@RequestBody Car car) {
        return ResponseEntity.status(HttpStatus.CREATED).body(carService.createCar(car));
    }
}
