package com.example.app.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class ExamManager {
    private int id;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd") private LocalDate date;
    private int japanese;
    private int math;
    private int english;
    private Integer japaneseHistory;
    private Integer worldHistory;
    private Integer geography;
    private Integer physics;
    private Integer chemistry;
    private Integer biology;

    public int getSociety() {
        assert japaneseHistory != null || worldHistory != null || geography != null;
        if(japaneseHistory != null) {
            return japaneseHistory;
        }
        if(worldHistory != null) {
            return worldHistory;
        }
        return geography;
    }
    public String getSocietySub() {
        assert japaneseHistory != null || worldHistory != null || geography != null;
        if(japaneseHistory != null) {
            return "日本史";
        }
        if(worldHistory != null) {
            return "世界史";
        }
        return "地理";
    }
    public int getScience() {
        assert physics != null || chemistry != null || biology != null;
        if(physics != null) {
            return physics;
        }
        if(chemistry != null) {
            return chemistry;
        }
        return biology;
    }
    public String getScienceSub() {
        assert physics != null || chemistry != null || biology != null;
        if(physics != null) {
            return "物理";
        }
        if(chemistry != null) {
            return "化学";
        }
        return "生物";
    }
    public int getSum() {
        int sum = 0;
        sum += japanese;
        sum += math;
        sum += english;
        sum += getSociety();
        sum += getScience();
        return sum;
    }
}
