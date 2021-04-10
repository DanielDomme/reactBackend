package com.example.demo.controllers;

import com.example.demo.daos.Dao;
import com.example.demo.daos.PepperMedicalDAO;
import com.example.demo.domains.pepper.PepperMedicalRecord;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(path="pepper")
public class DogController {
    private final PepperMedicalDAO pepperMedicalRecordDao = new PepperMedicalDAO();

    @GetMapping("/medicalRecords")
    public ResponseEntity<List<PepperMedicalRecord>> getMedicalRecords() {
        return ResponseEntity.ok(pepperMedicalRecordDao.getAll());
    }

    @PostMapping("/insertRecord")
    public HttpEntity<HttpStatus> insertMedicalRecord(@RequestBody PepperMedicalRecord pepperMedicalRecord) {
        return ResponseEntity.status(pepperMedicalRecordDao.insert(pepperMedicalRecord) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST).build();
    }

    @PutMapping("/updateRecord")
    public HttpEntity<HttpStatus> updateMedicalRecord(@RequestBody PepperMedicalRecord pepperMedicalRecord) {
        return ResponseEntity.status(pepperMedicalRecordDao.update(pepperMedicalRecord) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST).build();
    }

    @DeleteMapping("/removeRecord")
    public HttpEntity<HttpStatus> deleteMedicalRecord(@RequestBody PepperMedicalRecord pepperMedicalRecord) {
        return ResponseEntity.status(pepperMedicalRecordDao.delete(pepperMedicalRecord) ? HttpStatus.OK : HttpStatus.BAD_REQUEST).build();
    }
}
