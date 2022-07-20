package com.example.bulkhousebackend.repository;

import com.example.bulkhousebackend.entity.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository <Workout, Integer> {
}
