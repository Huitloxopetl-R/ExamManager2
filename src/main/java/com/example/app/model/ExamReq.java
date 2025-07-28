package com.example.app.model;

import lombok.Data;

@Data
public class ExamReq {
    private Examinee examinee;
    private ExamData examData;

    public Examinee getExaminee(){ return examinee; }
    public ExamData getExamData(){ return examData; }
}
