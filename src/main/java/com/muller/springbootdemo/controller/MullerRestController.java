package com.muller.springbootdemo.controller;

import com.muller.springbootdemo.dao.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MullerRestController {

    private final Coach coach;

    @Autowired
    public MullerRestController(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/daily")
    public String dailyWorkout(){
      return coach.dailyWorkout();
    }


}
