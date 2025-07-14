package com.example.app.mapper;

import com.example.app.model.ExamManager;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ManagerMapper {
    public List<ExamManager> findAll();
}
