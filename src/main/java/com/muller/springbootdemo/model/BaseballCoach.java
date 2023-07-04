package com.muller.springbootdemo.model;

import com.muller.springbootdemo.dao.Coach;

public class BaseballCoach implements Coach {
    @Override
    public String dailyWorkout() {
        return "Baseball Focused Training";
    }
}
