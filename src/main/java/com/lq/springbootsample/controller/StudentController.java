package com.lq.springbootsample.controller;

import com.lq.springbootsample.mapper.StudentMapper;
import com.lq.springbootsample.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentMapper studentMapper;

    @RequestMapping("/listStudent")
    public String listStudent(Model model){

        List<Student> studentList = studentMapper.findAll();
        model.addAttribute(studentList);
        return "studentList";
    }
}
