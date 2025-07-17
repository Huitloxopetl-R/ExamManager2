package com.example.app.model;

import lombok.Data;

@Data
public class ExamData {
    private int id;
    private int japanese;
    private int math;
    private int english;
    private int japaneseHistory;
    private int worldHistory;
    private int geography;
    private int physics;
    private int chemistry;
    private int biology;
    public void setId(final int id){ this.id = id; }

    private int society;
    private String societySub;
    private int science;
    private String scienceSub;
}
