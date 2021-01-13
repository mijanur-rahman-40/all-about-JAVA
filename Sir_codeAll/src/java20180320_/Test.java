/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180320_;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Teacher303LAB
 */
public class Test {
    public static void main(String args[]){
        //Teacher ob = new Teacher("AN", 5.8, 30, 30, "Lecturer");
        //ob.show();
        
        //Super class variable can reference subclass object
        Teacher ob1 = new Teacher("AN", 5.8, 30, 30, "Lecturer");
        Teacher ob2 = new Teacher("SS", 5.7, 35, 40, "Asst. Professor");
        
        Student ob3 = new Student("A", 6, 20, 3.7);
        Student ob4 = new Student("B", 5.9, 19, 3.8);
        
        List list = new ArrayList();
        list.add(ob1);
        list.add(ob2);
        list.add(ob3);
        list.add(ob4);
        
        //Person ob = list.get(3);
        
        //ob.show();
        //System.out.println("" + ob.cgpa);
        //ob.;
    }
}
