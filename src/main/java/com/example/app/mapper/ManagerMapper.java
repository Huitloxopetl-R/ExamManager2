package com.example.app.mapper;

import com.example.app.model.ExamData;
import com.example.app.model.ExamManager;
import com.example.app.model.Examinee;
import com.example.app.model.SortRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ManagerMapper {
    public List<ExamManager> findAll();
    public ExamManager findUpdatee(final int id);
    public List<ExamManager> sort(@Param("req") final SortRequest sortRequest, final boolean sortedAscend);
    public void insertExaminee(final Examinee examinee);
    public void insertExamData(final ExamData examData);
    public void updateExaminee(final Examinee examinee);
    public void updateExamData(final ExamData examData);
    public void deleteOneExaminee(final Examinee examinee);
    public void deleteOneExamData(final Examinee examinee);
    public void deleteName(final Examinee examinee);
}
