package com.lis.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nazir on 6/10/17.
 */

@RestController
@RequestMapping(value = "patients")
public class PatientController {
    @RequestMapping(method = RequestMethod.GET)
    public String sayHi(){
        return "Hello";
    }
}
