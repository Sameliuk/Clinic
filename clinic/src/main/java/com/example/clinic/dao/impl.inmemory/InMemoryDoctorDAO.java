package com.example.clinic.dao.impl.inmemory;

import com.example.clinic.dao.DoctorDAO;
import com.example.clinic.model.Doctor;

import java.util.Collection;
import java.util.TreeMap;

class InMemoryDoctorDAO extends InMemoryAbstractDAO<Doctor> implements DoctorDAO {

    InMemoryDoctorDAO(InMemoryDatabase database) {
        super(database.doctors, Doctor::getDoctorId, Doctor::setDoctorId, database);
    }
    private  TreeMap<Integer, Doctor> doctors = (TreeMap) database.doctors;

    @Override
    public Doctor findById(Integer id) {
        return doctors.get(id);
    }

    @Override
    public Collection<Doctor> findAll() {
        return doctors.values();
    }


}
