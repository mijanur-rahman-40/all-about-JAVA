/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180321;

/**
 *
 * @author Teacher303LAB
 */
public interface Bounceable extends Moveable, Spherical {
    int a = 100;
    void bounce();
    public abstract void setBounceFactor();
}