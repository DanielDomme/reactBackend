package com.example.demo;

import com.example.demo.models.pepper.PepperMedicalRecord;
import com.google.gson.Gson;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Date;

@Log4j2
@RestController
@RequestMapping(path = "/resource")
public class MainController {

    @GetMapping("/hello")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public PepperMedicalRecord hello(HttpServletRequest request, HttpServletResponse response) {
        Date date = new Date();
        log.info("Path: /hello " + HttpStatus.OK);
        return new PepperMedicalRecord(date, BigDecimal.valueOf(0.0),"Ears", "Ashleigh", "Home", "Ears inflammed. Cleaned" );
    }

    @GetMapping("/yay")
    private void yay(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Gson gson = new Gson();
        log.info("Request" + request.getRequestURI());
        Date date = new Date();
        PepperMedicalRecord pepper = new PepperMedicalRecord(date, BigDecimal.valueOf(20.02),"Spay", "Dr. Luck", "Pillsbury Hospital", "Spayed" );
        String responseBody = gson.toJson(pepper);
        PrintWriter out = response.getWriter();
        response.setStatus(HttpServletResponse.SC_OK);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(responseBody);
        out.flush();
    }

    @GetMapping("/dogs")
    public ResponseEntity<PepperMedicalRecord> hello() {
        Date date = new Date();
        log.info("Path: /dogs " + HttpStatus.OK);
        PepperMedicalRecord record = new PepperMedicalRecord(date, BigDecimal.valueOf(0.0),"Butt", "Ashleigh", "Home", "Butt leaking. Cleaned" );
        return ResponseEntity.status(HttpStatus.OK).body(record);
    }
}
