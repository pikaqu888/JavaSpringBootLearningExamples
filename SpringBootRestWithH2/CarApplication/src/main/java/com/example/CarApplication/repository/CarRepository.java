package com.example.CarApplication.repository;

import com.example.CarApplication.model.entity.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long>{

}
