package com.example.clinic.services;

import com.example.clinic.model.Appointment;
import com.example.clinic.model.Doctor;
import com.example.clinic.model.User;

import java.util.Collection;

public interface   UserService {

   User getByLogin(String login);

   boolean checkPassword(User user, String password);

   void addAppointment(User user, Doctor doctor, String time);
   void deleteAppointment(User user, Integer appointmentId);

   Collection<User> findAll();

   Collection<Appointment> findAllAppointments(User user);
}

