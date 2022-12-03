package com.example.CarApplication.model.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name="Cars")
public class Car {
    //@Column(name = "CAR_ID")
   // @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long carId;
   // @Column(name = "MODEL", nullable = false)
    private String model;
   // @Column(name = "COLOR", nullable = false)
    private String color;
}
