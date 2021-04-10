package com.example.demo.daos;

import com.example.demo.domains.knitting.YarnInventory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class YarnInventoryDAO implements Dao<YarnInventory> {
    private final List<YarnInventory> yarnInventoryList = new ArrayList<>();

    public YarnInventoryDAO() {
        yarnInventoryList.add(new YarnInventory(1,"../../../public/images/exampleKnitted.jpeg", LocalDate.parse("1998-03-12"), "Lion", "Pretty Yarn!", "Sport", "Brown", "Wool", 5, "1a", 5.23, new BigDecimal("35.53"), "Closet"));
        yarnInventoryList.add(new YarnInventory(2,"../../../public/images/exampleKnitted.jpeg", LocalDate.parse("2005-01-10"), "Malabrigo", "Got downtown!", "Bulky", "Orange", "Cotton", 16, "1abbaed", 5.23, new BigDecimal("100"), "Closet"));
    }

    @Override
    public Optional<YarnInventory> get(int id) {
        return Optional.empty();
    }

    @Override
    public List<YarnInventory> getAll() {
        return yarnInventoryList;
    }

    @Override
    public boolean insert(YarnInventory yarnInventory) {
        return yarnInventoryList.add(yarnInventory);
    }

    @Override
    public boolean update(YarnInventory yarnInventory) {
        for (int i = 0; i < yarnInventoryList.size(); i++) {
            if(yarnInventoryList.get(i).getEntryId() == yarnInventory.getEntryId()){
                yarnInventoryList.set(i, yarnInventory);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(YarnInventory yarnInventory) {
        for (int i = 0; i < yarnInventoryList.size(); i++) {
            if(yarnInventoryList.get(i).getEntryId() == yarnInventory.getEntryId()){
                yarnInventoryList.remove(i);
                return true;
            }
        }
        return false;
    }
}
