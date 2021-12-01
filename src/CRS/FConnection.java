/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aashgar
 */
public class FConnection {
    public boolean verifyUser(String loginName, String password){
        boolean isValid = false;
        try {
            Scanner scanner = new Scanner(new File("./src/CRS/password.txt"));
            while(scanner.hasNextLine()){
                String name= scanner.next();
                String psw = scanner.next();
                if(loginName.equals(name) && password.equals(psw))
                    isValid = true;              
            }
             scanner.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
        return isValid;
    }
    
    public void saveStudent(Student student){
        
        try {
            FileWriter fileWriter = new FileWriter("./src/CRS/students.data", true);
            fileWriter.write(student.getName() + " " 
                    + student.getMajor() + " " 
                    + student.getGrade()+"\n");
            fileWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
