/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS.DataStorage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author aashgar
 */
public class UserConnection {
    public boolean verifyUser(String loginName, String password){
        boolean isValid = false;
        try {
            Scanner scanner = new Scanner(new File("./src/CRS/DataStorage/password.txt"));
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
}
