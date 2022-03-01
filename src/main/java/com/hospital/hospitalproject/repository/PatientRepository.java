package com.hospital.hospitalproject.repository;

import com.hospital.hospitalproject.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Patient findByName(String name);
}

