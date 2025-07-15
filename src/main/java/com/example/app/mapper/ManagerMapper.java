package com.example.app.mapper;

import com.example.app.model.ExamManager;
import com.example.app.model.Examinee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Mapper
public interface ManagerMapper {
    public List<ExamManager> findAll();
    public void updateResult(@ModelAttribute final ExamManager examManager);
    public void deleteOne(@ModelAttribute final Examinee examinee);
    public void deleteName(@ModelAttribute final Examinee examinee);
}
