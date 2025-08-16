package com.example.SpringSecurityDemo.service;

import com.example.SpringSecurityDemo.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    List<Student> students=new ArrayList<>(Arrays.asList(new Student(1,"Durai",24),
            new Student(2,"Kiran",30)));


    public List<Student> getAllStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
