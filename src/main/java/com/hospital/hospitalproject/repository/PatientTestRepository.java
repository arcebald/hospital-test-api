package com.hospital.hospitalproject.repository;

import com.hospital.hospitalproject.model.PatientTest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PatientTestRepository extends JpaRepository<PatientTest, Long> {
    Optional<PatientTest> findByName(String name);

    List<PatientTest> findByPatientId(Long patientId);
}
