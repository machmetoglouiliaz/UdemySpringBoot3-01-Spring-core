package com.mourat.udemy.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Sprint for 2 hours!";
    }
}
