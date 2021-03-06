/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aashgar
 */
public class Subject {
    private String data;
    private List<Observer> observers =
            new ArrayList<Observer>();

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
        notifyAllObservers();
    }
    public void attach(Observer observer){
        observers.add(observer);
    }
   private void notifyAllObservers(){
       for(Observer observer: observers)
           observer.update();
   } 
    
}
