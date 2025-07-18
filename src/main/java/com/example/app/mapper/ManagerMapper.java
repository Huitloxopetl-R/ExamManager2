package com.example.app.mapper;

import com.example.app.model.ExamData;
import com.example.app.model.ExamManager;
import com.example.app.model.Examinee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface ManagerMapper {
    public List<ExamManager> findAll();
    public ExamManager findUpdatee(@RequestParam("id") final int id);

    // TODO: @ModelAttributeはここで使用しても無効だという話をしたと思います。どういう意図で書いているのでしょうか。
    public void insertExaminee(@ModelAttribute final Examinee examinee);
    public void insertExamData(@ModelAttribute final ExamData examData);
    public void updateExaminee(@ModelAttribute final Examinee examinee);
    public void updateExamData(@ModelAttribute final ExamData examData);
    public void deleteOneExaminee(@ModelAttribute final Examinee examinee);
    public void deleteOneExamData(@ModelAttribute final Examinee examinee);
    public void deleteName(@ModelAttribute final Examinee examinee);
}
