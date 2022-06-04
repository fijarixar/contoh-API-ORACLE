package com.example.juniorprogrammer.apicrud;

import com.example.juniorprogrammer.apicrud.entities.CarEntity;
import com.example.juniorprogrammer.apicrud.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value= "/mobil_2")
public class CarController {

    @Autowired
    CarRepository carRepository;


    @GetMapping(value = "checkAPI")
    public String checkAPI() {
        return "Assalamualaikum Jakarta";
    }

    @PostMapping(value = "addNewCar")
    public CarEntity addNewCar(@RequestBody CarEntity param) {
        
        carRepository.save(param);
        return param;
    }

    @GetMapping(value = "getAllCar")
    public List<CarEntity> getAllCar() {
        return carRepository.findAll();
    }
}
