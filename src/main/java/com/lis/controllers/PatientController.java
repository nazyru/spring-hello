package com.lis.controllers;

import com.lis.entities.Patient;
import com.lis.repositories.PatientRepository;
import com.lis.utils.ApiPaths;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nazir on 6/10/17.
 */

@RestController
@RequestMapping(value = ApiPaths.PATIENTS)
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;

    @GetMapping
    public List<Patient> getAll(){
        List<Patient> patients = new ArrayList<>();
        patientRepository.findAll().forEach(patients::add);
        return patients;
    }

    @PostMapping
    public ResponseEntity<Patient> addPatient(Patient patient){
        Patient savedPatient = patientRepository.save(patient);
        return ResponseEntity.ok(savedPatient);
    }
}
