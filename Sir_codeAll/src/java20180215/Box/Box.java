/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180215.Box;

/**
 *
 * @author Teacher303LAB
 */
public class Box {
    static int x =10;
    
    // Class Memeber (Variable / Method)    
    // instance variable
    int height;
    int width;
    int depth;
    
    //Constructor Overloading
    Box(){
        this.height = 1;
        this.width = 1;
        this.depth = 1;
        System.out.println("Inside Box()");
    }
    
    Box(int len){
        //height = width = depth = len;
        this(len, len, len);
        System.out.println("Inside Box(int len)");
        
    }
    
//    Box(int height, int width, int depth){
//        this.height = height;
//        this.width = width;
//        this.depth = depth;
//        System.out.println("Inside Box(int h, int w, int d)");
//    }
    
    Box(double w, int x, int y){
        this.height = height;
        this.width = width;
        this.depth = depth;
        System.out.println("Inside Box(double h, int w, int d)");
    }
    
    Box(Box ob){
        this.height = ob.height;
        this.width = ob.width;
        this.depth = ob.depth;
        System.out.println("Inside Box(Box ob)");
    }
    
    int getVolume(){
        //int h;
        return height*width*depth;
    }
    
    //Instance variable hiding
    void setDimension(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
}
