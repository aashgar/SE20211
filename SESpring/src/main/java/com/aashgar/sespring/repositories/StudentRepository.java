/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aashgar.sespring.repositories;

import com.aashgar.sespring.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author aashgar
 */
public interface StudentRepository extends JpaRepository<Student, Integer>{
    
}
