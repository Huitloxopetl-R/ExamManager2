package com.example.app.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class Examinee {
    private int id;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd") private LocalDate date;
    public int getId(){ return id; }
}
