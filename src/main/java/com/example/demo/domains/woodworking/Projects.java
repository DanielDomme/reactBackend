package com.example.demo.domains.woodworking;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
public class Projects {
    private String postTitle;
    private String imageLocation;
    private String bodyContent;
    private LocalDate date;
}
