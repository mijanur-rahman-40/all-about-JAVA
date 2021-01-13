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
public class Student extends Person {
    
    double cgpa;
    Student(String name, double height, int age, double cgpa){
        super(name, height, age);
        this.cgpa = cgpa;
    }
    
}
