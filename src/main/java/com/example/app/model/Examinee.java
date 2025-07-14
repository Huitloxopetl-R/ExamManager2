package com.example.app.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Examinee {
    private int id;
    private String name;
    private LocalDate date;
}
