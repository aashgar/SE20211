/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS.DataStorage;

import CRS.Models.Student;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author aashgar
 */
public class StudentConnection {
      public void saveStudent(Student student){
        
        try {
            FileWriter fileWriter = new FileWriter("./src/CRS/DataStorage/students.data", true);
            fileWriter.write(student.getName() + " " 
                    + student.getMajor() + " " 
                    + student.getGrade()+"\n");
            fileWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
