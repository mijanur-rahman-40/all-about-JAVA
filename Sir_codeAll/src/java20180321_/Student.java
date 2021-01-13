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
public class Student extends Person{

    double cgpa;
    public Student(String name, int age, double height, double cgpa) {
        super(name, age, height);
        this.cgpa = cgpa;
        
    }
    
}
