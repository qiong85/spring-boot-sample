package com.lq.springbootsample.serviceImpl;

import com.lq.springbootsample.mapper.StudentMapper;
import com.lq.springbootsample.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentMapper {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }

    @Override
    public void addStudent(Student student) {
        studentMapper.addStudent(student);
    }

}
