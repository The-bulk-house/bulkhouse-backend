package com.example.bulkhousebackend.controller;

import com.example.bulkhousebackend.entity.Workout;
import com.example.bulkhousebackend.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("/api")
public class WorkoutController {

    @Autowired
    private WorkoutService service;

    //Get products
    @GetMapping(value = "/workouts")
    public List<Workout> findAllWorkouts() {
            return service.getWorkouts();
    }
}
