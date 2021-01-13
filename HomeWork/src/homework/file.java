/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author CSELAB303
 */
public class file {
     public static void main(String[] args) throws Exception {
             Map<String,String>map = new HashMap<String,String>();
            File file = new File("two.txt");

            BufferedReader br = new BufferedReader(new FileReader(file));

            String st,user,pass;
            while ((st = br.readLine()) != null) {
               // System.out.println(st);
                String[] tokens = st.split("#");
                user = tokens[0];
                pass = tokens[1];
                map.put(user,pass);
                System.out.println("User : "+user+" Pass: "+pass);
            }
            System.out.println("$$ : "+map.get("Aff"));
        }
    }

