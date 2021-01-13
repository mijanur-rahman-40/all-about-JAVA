/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180321_;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Teacher303LAB
 */
public class Test {
    public static void main(String args[]){
        //System.out.println("");
        Teacher ob1 = new Teacher("AN", 30, 5.7, "Lecturer", 30);
        Teacher ob2 = new Teacher("SS", 35, 5.6, "Asst Professor", 40);
        Student ob3 = new Student("A", 18, 5.7, 3.7);
        Student ob4 = new Student("B", 20, 5.8, 3.9);
        
        List<Person> list = new ArrayList<Person>();
        list.add(ob1);
        list.add(ob2);
        list.add(ob3);
        list.add(ob4);
        
        
        Person ob = list.get(2);
        
        Student ob9 = (Student) list.get(2);
        //ob9.show();
        
        System.out.println(""+ob9.cgpa);
        
        //Teacher ob = (Teacher) list.get(0);
        
    }
}
