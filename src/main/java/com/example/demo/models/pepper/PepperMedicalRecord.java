package com.example.demo.models.pepper;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@Getter
public class PepperMedicalRecord {
    private Date recordDate;
    private BigDecimal cost;
    private String title;
    private String doctor;
    private String location;
    private String description;
}
