package com.example.app.controller;

import com.example.app.mapper.ManagerMapper;
import com.example.app.model.ExamManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ManagerController {
    @Autowired
    private ManagerMapper mapper;

    @GetMapping("/")
    public String index(final Model model) {
        final List<ExamManager> examinees = mapper.findAll();
        model.addAttribute("examinees", examinees);
        return "index";
    }
}
