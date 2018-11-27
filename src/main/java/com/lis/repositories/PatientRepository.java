package com.lis.repositories;

import com.lis.entities.Patient;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by nazir on 6/11/17.
 */
public interface PatientRepository extends CrudRepository<Patient, Long> {
    List<Patient> findByFirstName(String firstName);
}
