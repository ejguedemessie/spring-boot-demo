package com.muller.springbootdemo.model;

import com.muller.springbootdemo.dao.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String dailyWorkout() {
        return "Give me 5each push up and 1k jumping";
    }
}
