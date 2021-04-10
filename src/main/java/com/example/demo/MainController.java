package com.example.demo;

import com.example.demo.domains.pepper.PepperMedicalRecord;
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
import java.time.LocalDate;
import java.util.Date;

@Log4j2
@RestController
@RequestMapping(path = "/resource")
public class MainController {

    @GetMapping("/hello")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public PepperMedicalRecord hello(HttpServletRequest request, HttpServletResponse response) {
        log.info("Path: /hello " + HttpStatus.OK);
        return new PepperMedicalRecord(1, LocalDate.now(),BigDecimal.valueOf(13.5),"Grooming", "Asheligh", "ears trimmed.");
    }

    @GetMapping("/yay")
    private void yay(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Gson gson = new Gson();
        log.info("Request" + request.getRequestURI());
        PepperMedicalRecord pepper = new PepperMedicalRecord(1,LocalDate.now(),BigDecimal.valueOf(13.5),"Grooming", "Asheligh", "ears trimmed.");
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
        log.info("Path: /dogs " + HttpStatus.OK);
        PepperMedicalRecord record = new PepperMedicalRecord(1,LocalDate.now(),BigDecimal.valueOf(13.5),"Grooming", "Asheligh", "ears trimmed.");
        return ResponseEntity.status(HttpStatus.OK).body(record);
    }
}
