package com.example.app.restservice;

import com.example.app.mapper.ManagerMapper;
import com.example.app.model.ExamManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/exam-manager")
public class ExamManagerAPI {
    @Autowired
    private ManagerMapper mapper;

    @GetMapping
    public List<ExamManager> getAllResults() {
        return mapper.findAll();
    }
}
