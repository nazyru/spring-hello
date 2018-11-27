package com.lis.repositories;

import com.lis.entities.Patient;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by nazir on 6/17/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientRepositoryTest {
    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void testCreatePatient() {
        /**
         * Given that
         */
        Patient patient = new Patient();
        patient.setFirstName("Nazir");
        patient.setLastName("Bunu");
        patient.setOtherName("Saidu");
        Patient result = patientRepository.save(patient);
        /**
         * Then
         */
        assertEquals(patient, result);

    }

    @Test
    public void testFindByFirstName(){
        /**
         * Given that
         */
        String firstName = "nazir";
        /**
         * When
         */
        List<Patient> result = patientRepository.findByFirstName(firstName);
        /**
         * Then
         */
        assertThat(result, Matchers.hasSize(1));

    }

}
