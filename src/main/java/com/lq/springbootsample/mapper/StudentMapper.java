package com.lq.springbootsample.mapper;

import com.lq.springbootsample.pojo.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {

    @Select("SELECT * FROM student;")
    List<Student> findAll();


    @Insert("INSERT INTO student (id,student_id,name,age,sex,birthday) " +
            "VALUES( #{id}, #{student_id}, #{name}, #{age}, #{sex}, #{birthday} )")
    void addStudent(Student student);
}
