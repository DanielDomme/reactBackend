package com.example.demo.models.pepper;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
public class Pepper {
    private String[] pepperPictures;
    private String[] dogFood;
    @Autowired
    private PepperMedicalRecord pepperMedicalRecord;

}
