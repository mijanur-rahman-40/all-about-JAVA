/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180405;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Teacher303LAB
 */
public class MapTest {
    enum Pets{DOG, CAT, HORSE}
    public static void main(String args[]){
        Map<Object, Object> m = new HashMap<Object, Object>();
        m.put("k1", new Dog("aiko"));
        m.put("k2", Pets.DOG);
        m.put(Pets.CAT, "CAT Value");
        Dog clover = new Dog("Clover");
        m.put(clover, "Dog Value");
        m.put(new Cat(), "CAT Value 2");
           
        System.out.println("1#"+ m.get("k1"));
                
    }
}
