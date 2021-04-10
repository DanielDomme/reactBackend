package com.example.demo.controllers;

import com.example.demo.daos.YarnInventoryDAO;
import com.example.demo.domains.knitting.YarnInventory;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequestMapping(path= "/yarn")
public class YarnController {
    private final YarnInventoryDAO yarnInventoryDAO = new YarnInventoryDAO();

    @GetMapping("/all")
    public ResponseEntity<List<YarnInventory>> getAllYarnInventory() {
        return ResponseEntity.status(HttpStatus.OK).body(yarnInventoryDAO.getAll());
    }

    @DeleteMapping("/delete")
    public ResponseEntity<HttpStatus> deleteYarnEntry(@RequestBody YarnInventory yarnInventory) {
        return ResponseEntity.status(yarnInventoryDAO.delete(yarnInventory) ? HttpStatus.OK : HttpStatus.BAD_REQUEST).build();
    }
}
