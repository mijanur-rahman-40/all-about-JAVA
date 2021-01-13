/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180321_;

/**
 *
 * @author Teacher303LAB
 */
public class Person {
    String name;
    int age;
    double height;
    
    Person(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    
    void doWork(){
        System.out.println("Working");
    }
}
