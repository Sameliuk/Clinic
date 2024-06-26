package com.example.clinic.services;

import com.example.clinic.dao.ClinicDAO;
import com.example.clinic.model.Schedule;

import java.util.Collection;

public class ScheduleServiceImpl implements ScheduleService{

    ClinicDAO clinicDAO;

    public ScheduleServiceImpl(ClinicDAO clinicDAO) {
        this.clinicDAO = clinicDAO;
    }

    @Override
    public void updateTimes(Integer doctorId, Schedule schedule) {
        clinicDAO.getScheduleDAO().updateTimes(doctorId, schedule);
    }

    @Override
    public Collection<Schedule> findAll(Integer doctorId) {
        return clinicDAO.getScheduleDAO().findByDoctorId(doctorId);
    }


    @Override
    public Schedule getScheduleById(Integer timeId) {
        return clinicDAO.getScheduleDAO().getScheduleById(timeId);
    }
}
