package com.hospital.hospitalproject.repository;

import com.hospital.hospitalproject.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    boolean existsByDoctorName(String doctorName);

    Doctor findDoctorByDoctorName(String name);
}