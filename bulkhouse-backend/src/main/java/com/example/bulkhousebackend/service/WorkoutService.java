package com.example.bulkhousebackend.service;

import com.example.bulkhousebackend.entity.Workout;
import com.example.bulkhousebackend.repository.WorkoutRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutService {

    private final WorkoutRepository workoutRepository;


    public WorkoutService(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    //get workouts
    public List<Workout> getWorkouts() {
            return workoutRepository.findAll();
    }
}
