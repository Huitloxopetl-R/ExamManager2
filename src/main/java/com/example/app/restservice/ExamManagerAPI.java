package com.example.app.restservice;

import com.example.app.mapper.ManagerMapper;
import com.example.app.model.ExamManager;
import com.example.app.model.ExamReq;
import com.example.app.model.Examinee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/exam-manager")
public class ExamManagerAPI {
    @Autowired
    private ManagerMapper mapper;

    @GetMapping
    public List<ExamManager> getAll(){ return mapper.findAll(); }

    @PostMapping("/create")
    public void insert(@RequestBody final ExamReq examReq) {
        mapper.insertExaminee(examReq.getExaminee());
        final int id = examReq.getExaminee().getId();
        examReq.getExamData().setId(id);
        mapper.insertExamData(examReq.getExamData());
    }

    @PostMapping("/update")
    public void update(@RequestBody final ExamReq examReq) {
        mapper.updateExaminee(examReq.getExaminee());
        final int id = examReq.getExaminee().getId();
        examReq.getExamData().setId(id);
        mapper.updateExamData(examReq.getExamData());
    }

    @PostMapping("/delete")
    public void delete(@RequestBody final Examinee examinee) {
        mapper.deleteExaminee(examinee);
    }
}