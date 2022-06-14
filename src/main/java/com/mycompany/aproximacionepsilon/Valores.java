/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aproximacionepsilon;

/**
 *
 * @author aleja
 */
public class Valores {
    private double x;
    private double y;
    
    public Valores(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Valores() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Valores{" + "x=" + x + ", y=" + y + '}';
    }
    
}
