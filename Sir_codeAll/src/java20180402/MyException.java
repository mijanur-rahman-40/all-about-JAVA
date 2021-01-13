/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180402;

/**
 *
 * @author Teacher303LAB
 */
public class MyException extends Exception {
    
    String detail;
    
    MyException(String str){
        //super(str);
        this.detail = str;
    }
    
    public String toString(){
        return "$" + this.getClass().getName() + ":"+detail;
    }
}
