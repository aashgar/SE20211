/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author aashgar
 */
public class MainApp {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.setData("Web1");
        
        Singleton singleton2 = Singleton.getInstance();
        singleton2.setData("SE");
        System.out.println(singleton1.getData());
        System.out.println(singleton2.getData());
    }
}
