package com.example.demo.domains.pepper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
public class PepperMedicalRecord {
    private int entryId;
    private LocalDate date;
    private BigDecimal cost;
    private String type;
    private String performedBy;
    private String description;
}
