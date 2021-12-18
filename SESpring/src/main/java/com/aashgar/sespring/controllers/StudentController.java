/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aashgar.sespring.controllers;

import com.aashgar.sespring.models.Student;
import com.aashgar.sespring.services.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author aashgar
 */
@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService studentService;
    
    @GetMapping("/showmessage/")
    public String ShowMessage(){
        return "<h1> SE Spring Message <h1>";
    }
    
    @PostMapping("/savestudent/")
    public Student SaveStudent(@RequestBody Student student){
        return this.studentService.saveStudent(student);
    }
    
    @GetMapping("/showallstudents/")
    public List<Student> ShowAllStudents(){
        return this.studentService.findAll();
    }
}
