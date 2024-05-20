package com.example.clinic.services;

import com.example.clinic.model.Schedule;

import java.util.Collection;

public interface ScheduleService {

    void updateTimes(Integer doctorId, Schedule schedule);

    Collection<Schedule> findAll(Integer doctorId);

    Schedule getScheduleById(Integer timeId);
}
