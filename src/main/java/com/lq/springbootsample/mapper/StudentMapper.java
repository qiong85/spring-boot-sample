package com.lq.springbootsample.mapper;

import com.lq.springbootsample.pojo.Student;
import org.apache.ibatis.annotations.*;
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

    @Select("SELECT * FROM student WHERE id = #{id};")
    Student selectStudentById(Integer id);

    @Delete("DELETE FROM student where id=#{id};")
    void deleteStudentById(Integer id);

    @Update("UPDATE student SET student_id = #{student_id},name = #{name},age = #{age}," +
            "sex = #{sex},birthday = #{birthday}," +
            "createTime=#{createTime}, updateTime=#{updateTime}" +
            "WHERE id = #{id}")
    void updateStudent(Student student);
}
