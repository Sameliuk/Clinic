package com.example.clinic.services;

import com.example.clinic.model.Appointment;

import java.util.Collection;

public interface AppointmentService {

    Collection<Appointment> getAllAppointments();
}
