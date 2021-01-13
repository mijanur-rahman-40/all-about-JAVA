/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180320_;

/**
 *
 * @author Teacher303LAB
 */
public class Person {
    
    String name;
    double height;
    int age;
    
    Person(String name, double height, int age){
        this.name = name;
        this.height = height;
        this.age = age;
    }
    
    void doWork(){
        System.out.println("Working");
    }
    
}
