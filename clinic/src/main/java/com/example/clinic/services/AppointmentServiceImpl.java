package com.example.clinic.services;

import com.example.clinic.dao.ClinicDAO;
import com.example.clinic.model.Appointment;

import java.util.Collection;

public class AppointmentServiceImpl implements AppointmentService {

    ClinicDAO clinicDAO;

    public AppointmentServiceImpl(ClinicDAO clinicDAO) {
        this.clinicDAO = clinicDAO;
    }

    @Override
    public Collection<Appointment> getAllAppointments() {
        return clinicDAO.getAppointmentDAO().findAll();
    }
}
