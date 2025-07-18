package com.example.app.controller;

import com.example.app.mapper.ManagerMapper;
import com.example.app.model.ExamData;
import com.example.app.model.ExamManager;
import com.example.app.model.Examinee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ManagerController {
    @Autowired
    private ManagerMapper mapper;

    @GetMapping("/")
    public String index(final Model model) {
        final List<ExamManager> exResults = mapper.findAll();
        model.addAttribute("examResults", exResults);
        return "index";
    }

    @PostMapping("/create")
    public String insertResult(@ModelAttribute final Examinee examinee, @ModelAttribute final ExamData examData, final Model model) {
        mapper.insertExaminee(examinee);
        examData.setId(examinee.getId());
        mapper.insertExamData(examData);
        final List<ExamManager> exResults = mapper.findAll();
        model.addAttribute("examResults", exResults);
        return "index";
    }

    @GetMapping("/update")
    public String updateTarget(@ModelAttribute final ExamManager examManager, @RequestParam("id") final int id, final Model model) {
        final ExamManager exResult = mapper.findUpdatee(id);
        model.addAttribute("examResult", exResult);
        return "update";
    }

    @PostMapping("/update")
    public String updateResult(@ModelAttribute final Examinee examinee, @ModelAttribute final ExamData examData, final Model model) {
        mapper.updateExaminee(examinee);
        mapper.updateExamData(examData);
        final List<ExamManager> exResults = mapper.findAll();
        model.addAttribute("examResults", exResults);
        return "index";
    }

    @PostMapping("/delete-one")
    public String deleteOne(@ModelAttribute final Examinee examinee, final Model model) {
        mapper.deleteOneExaminee(examinee);
        mapper.deleteOneExamData(examinee);
        final List<ExamManager> exResults = mapper.findAll();
        model.addAttribute("examResults", exResults);
        return "index";
    }

    @PostMapping("/delete-Name")
    public String deleteName(@ModelAttribute final Examinee examinee, final Model model) {
        mapper.deleteName(examinee);
        final List<ExamManager> exResults = mapper.findAll();
        model.addAttribute("examResults", exResults);
        return "index";
    }
}
