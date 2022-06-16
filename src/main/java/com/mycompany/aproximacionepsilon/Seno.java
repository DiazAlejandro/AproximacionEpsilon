/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aproximacionepsilon;

/**
 *
 * @author aleja
 */
public class Seno {
    public static double val_x(double epsilon, double inf, double sup) {
        double x = (inf + sup) / 2; //Mitad del limite
        double y = evaluarS(x); //Valor en y 
        double valx = 0;
        double x1 = 0, y1 = 0;
        for (double i = inf ; i <= x ; i+=epsilon){
            valx = evaluarS(i);
            //System.out.println("x = "+i+ " y = "+valx);
            if(valx>=(0.332333f)&& valx<=(0.334333)){
                System.out.println("Seno : "+valx+"\nCoseno: "+evaluarC(valx));
            }
            x1 = i;
            y1 = valx;
        }
        /*System.out.println("Valor x = " + x);
        System.out.println("Valor de x = "+x1+" Valor de y = "+y1);*/
        return valx;
    }

    public static double evaluarS(double x) {
        return Math.sin(x);
    }
    public static double evaluarC(double x) {
        return Math.cos(x);
    }

    public static void main(String[] args) {
        val_x(0.001, 0, Math.PI/2);
    }
}