package com.example.demo.domains.knitting;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@Data
public class YarnInventory {
    private int entryId;
    private String pictureLocation;
    private LocalDate date;
    private String brand;
    private String notes;
    private String yarnWeight;
    private String color;
    private String material;
    private double skeinCount;
    private String lotNumber;
    private double amountRemaining;
    private BigDecimal cost;
    private String storageLocation;
}
