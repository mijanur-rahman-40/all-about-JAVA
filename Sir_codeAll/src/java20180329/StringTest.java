/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180329;

/**
 *
 * @author Teacher303LAB
 */
public class StringTest {
    //1. length
    //2. equal() / equalIgnoreCase()
    //3. charAt()
    //4. concat()
    //5. replace()
    //6. substring()
    //7. touppercase() / tolowercase()
    //8. toString()
    //9. trim()
    
    public static void main(String args[]){
        String s1 = "Java Programming ";
        
        int a =10;
        String s = "2009331001";
        Integer ax = 100; 
        
        int r = Integer.parseInt(s);
//        Double.pa
        
        System.out.println("$" + r);
        
        
        String str1 = " \n\t"
                + "Java Programming Java  ";
//        String str2 = "java programming";
//        System.out.println("1."+str1.length());
//        System.out.println("2."+str1.equals(str2));
//        System.out.println("2."+str1.equalsIgnoreCase(str2));
//        System.out.println("3."+ str1.charAt(5));
//        str1 = str1.concat(" World");
//        str1 = str1.replace("av", "x");
//        str1 = str1.substring(5,8);
//        System.out.println("6." + str1);
//        str1 = str1.toUpperCase();
//        System.out.println("7." + str1);
//        str1 = str1.trim();
//        System.out.println("8.#" + str1.trim()+"#");
        
        StringBuffer sb = new StringBuffer();
        sb.append("Java ");
        sb.append("World ");
        sb.append("Programming");
        
//        System.out.println("$$" + sb.toString());
    }
}