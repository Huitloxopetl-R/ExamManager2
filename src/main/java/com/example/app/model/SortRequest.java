package com.example.app.model;

import lombok.Data;

@Data
public class SortRequest {
    private int pattern;
    private String societySub;
    private String scienceSub;

    public int getPattern(){ return pattern; }
}
