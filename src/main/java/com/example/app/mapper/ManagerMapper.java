package com.example.app.mapper;

import com.example.app.model.ExamData;
import com.example.app.model.ExamManager;
import com.example.app.model.Examinee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Mapper
public interface ManagerMapper {
    public List<ExamManager> findAll();
    public void insertExaminee(@ModelAttribute final Examinee examinee);
    public void insertExamData(@ModelAttribute final ExamData examData);
    public void updateResult(@ModelAttribute final ExamManager examManager);
    public void deleteOneExaminee(@ModelAttribute final Examinee examinee);
    public void deleteOneExamData(@ModelAttribute final Examinee examinee);
    public void deleteName(@ModelAttribute final Examinee examinee);
}
