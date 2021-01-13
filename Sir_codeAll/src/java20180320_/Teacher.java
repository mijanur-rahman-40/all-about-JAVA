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
public class Teacher extends Person{
    
    String name;
    int salary;
    String designation;
    
    Teacher(String name, double height, int age, int salary, String designation){
       super(name, height, age);
       this.salary = salary;
       this.designation = designation;
    }
    
    //Overriden Method
    void doWork(){
        System.out.println("Teaching");
    }
        
    void show(){
        System.out.println("#" + name);
        System.out.println("#" + super.name);
    }
}
