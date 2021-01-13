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
public class Teacher extends Person{
    String name;
    String designation;
    double salary;
    
    Teacher(String name, int age, double height, String designation, double salary){
        super(name, age, height);
        this.designation = designation;
        this.salary = salary;
    }
    
    void doWork(){
        System.out.println("Teaching");
    }
    
    void show(){
        System.out.println("#"+name);
        System.out.println("#"+super.name);
        super.doWork();
    }
    
}
