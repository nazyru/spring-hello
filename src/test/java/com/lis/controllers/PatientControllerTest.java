package com.lis.controllers;

import com.lis.utils.ApiPaths;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Created by nazir on 11/27/18.
 */
@RunWith(SpringRunner.class)
public class PatientControllerTest {

    @Mock
    private PatientController patientController;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(patientController).build();
    }

    @Test
    public void testGetAll() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get(ApiPaths.PATIENTS))
            .andExpect(MockMvcResultMatchers.status().is(200));
    }
}
