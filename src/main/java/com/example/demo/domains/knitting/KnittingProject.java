package com.example.demo.domains.knitting;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
public class KnittingProject {
    private int entryId;
    private String imageLocation;
    private LocalDate date;
    private String bodyContent;
}
