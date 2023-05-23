package com.ua.robot.service;

import com.ua.robot.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
public List<Student> findAll(){
    return List.of(
            new Student(12, "Tony", 1),
            new Student(13, "Sonia", 3),
            new Student(22, "Tom", 2),
            new Student(17, "Harry", 5)
    );
}
}
