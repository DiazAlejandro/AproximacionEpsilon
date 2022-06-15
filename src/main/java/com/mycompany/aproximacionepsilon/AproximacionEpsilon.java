/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.aproximacionepsilon;

/**
 *
 * @author aleja
 */
public class AproximacionEpsilon {

    public static double val_x(double epsilon, double inf, double sup) {
        double x = (inf + sup) / 2; //Mitad del limite
        double y = evaluar(x); //Valor en y 
        double valx = 0;
        double x1 = 0, y1 = 0;
        for (double i = inf ; i <= x ; i+=epsilon){
            valx = evaluar(i);
            //System.out.println("x = "+i+ " y = "+valx);
            x1 = i;
            y1 = valx;
        }
        System.out.println("Valor x = " + x);
        System.out.println("Valor de x = "+x1+" Valor de y = "+y1);
        return valx;
    }

    public static double evaluar(double x) {
        return Math.pow(x, 2);
    }

    public static void main(String[] args) {
        val_x(0.00001, 0.5, 0.75);
    }
}
