package com.example.demo.daos;

import com.example.demo.domains.pepper.PepperMedicalRecord;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PepperMedicalDAO implements Dao<PepperMedicalRecord> {

    private final List<PepperMedicalRecord> medicalRecords = new ArrayList<>();

    public PepperMedicalDAO() {
        medicalRecords.add(new PepperMedicalRecord(1, LocalDate.parse("2020-10-10"), BigDecimal.valueOf(13.5),"Grooming", "Asheligh", "ears trimmed."));
        medicalRecords.add(new PepperMedicalRecord(2,LocalDate.now(), BigDecimal.valueOf(350.00),"surgery", "Asheligh", "spay."));
    }


    // pretty useless, maybe use hashmap?
    @Override
    public Optional<PepperMedicalRecord> get(int index) {
        return Optional.ofNullable(medicalRecords.get(index));
    }

    @Override
    public List<PepperMedicalRecord> getAll() {
        return medicalRecords;
    }

    @Override
    public boolean insert(PepperMedicalRecord pepperMedicalRecord) {
        return medicalRecords.add(pepperMedicalRecord);
    }

    @Override
    public boolean update(PepperMedicalRecord pepperMedicalRecord) {
        for (int i = 0; i < medicalRecords.size(); i++) {
            if(medicalRecords.get(i).getEntryId() == pepperMedicalRecord.getEntryId()){
                medicalRecords.set(i, pepperMedicalRecord);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(PepperMedicalRecord pepperMedicalRecord) {
        for (int i = 0; i < medicalRecords.size(); i++) {
            if(medicalRecords.get(i).getEntryId() == pepperMedicalRecord.getEntryId()){
                medicalRecords.remove(i);
                return true;
            }
        }
        return false;
    }
}
