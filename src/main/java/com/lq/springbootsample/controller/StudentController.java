package com.lq.springbootsample.controller;

import com.lq.springbootsample.mapper.StudentMapper;
import com.lq.springbootsample.pojo.Student;
import com.lq.springbootsample.serviceImpl.StudentServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    StudentServiceImpl studentService;

    @RequestMapping("/listStudent")
    public String listStudent(Model model){

        List<Student> studentList = studentService.findAll();
        model.addAttribute(studentList);
        return "studentList";
    }

    @RequestMapping("/addStudent")
    public void addStudent(Model model){

        Student student = new Student();
        student.setId(3);
        student.setStudent_id(3);
        student.setName("q");
//        student.setAge(3);
//        student.setSex("1");
//        student.setBirthday(new Date());
        studentService.addStudent(student);

//        model.addAttribute(studentList);
    }

    @GetMapping("/{id}")
    public String selectStudentById(@Param("id") Integer id, Model model){
        Student student = studentService.selectStudentById(id);
        model.addAttribute(student);
        return "studentList";
    }

    @RequestMapping("/{id}")
    public void deleteStudentById(@Param("id") Integer id){
        studentService.deleteStudentById(id);
    }

    @RequestMapping("/updateStudent/{id}")
    public void updateStudent(@Param("id") Integer id){

        Student student = new Student();
        student.setId(id);
        student.setStudent_id(100);
        student.setName("q");
//        student.setAge(3);
//        student.setSex("1");
//        student.setBirthday(new Date());
        studentService.updateStudent(student);

//        model.addAttribute(studentList);
    }

}
