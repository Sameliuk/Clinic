package com.example.clinic.services;

import com.example.clinic.model.Doctor;

import java.util.Collection;

public interface DoctorService {

    Doctor findById(Integer id);

    Collection<Doctor> findAll();

    void addSchedule(Integer doctorId, String time);

    void deleteSchedule(Integer doctorId, Integer timeId);

}
