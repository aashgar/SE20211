/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aashgar.sespring.services;

import com.aashgar.sespring.models.Student;
import com.aashgar.sespring.repositories.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aashgar
 */
@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return this.studentRepository.save(student);
    }

    public List<Student> findAll() {
        return this.studentRepository.findAll();
    }
    
}
