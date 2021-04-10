package com.example.demo.domains.pepper;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

@AllArgsConstructor
public class Pepper {
    private String[] pepperPictures;
    private String[] dogFood;
    @Autowired
    private ArrayList<PepperMedicalRecord> pepperMedicalRecords;

}
