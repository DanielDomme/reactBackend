package com.example.demo.domains.pepper;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PepperFood {
    private int id;
    private String brandName;
    private String flavor;
    private String comments;
    private int stars;
}
