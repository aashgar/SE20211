/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS.DataStorage;

import CRS.Models.Student;

/**
 *
 * @author aashgar
 */
public class FacadeDataStorage {
    private StudentConnection studentConnection;
    private UserConnection userConnection;
    private static FacadeDataStorage facadeDataStorage;

    private FacadeDataStorage() {
        this.studentConnection = new StudentConnection();
        this.userConnection = new UserConnection();
    }
    public static FacadeDataStorage getFacadeDataStorage(){
        if(facadeDataStorage == null)
            facadeDataStorage = new FacadeDataStorage();
        return facadeDataStorage;
    }
    
    public boolean verifyUser(String loginName, String password){
        return this.userConnection.verifyUser(loginName, password);
    }
    public void saveStudent(Student student){
        this.studentConnection.saveStudent(student);
    }
    
}
