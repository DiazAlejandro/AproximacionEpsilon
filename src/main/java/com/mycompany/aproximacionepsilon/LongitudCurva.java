/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aproximacionepsilon;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class LongitudCurva {
    /**
     * Método que se encargará de guardar los datos (en una lista) para graficar
     * una función, empleando una aproximación.
     * @param aprox Aproximación, entre menor sea, mejor será el resultado
     * @param inf Limite inferior
     * @param sup Limite superior
     * @return Lista con valor(x,y) para graficar
     */
    public static LinkedList<Valores> generarValores(double aprox, int inf, int sup) {
        LinkedList<Valores> valor = new LinkedList<Valores>();
        for (double i = inf; i < sup ; i += aprox) {
            valor.add(new Valores(i, evaluar(i)));
        }
        return valor;
    }

    /**
     * Método que se encargará de calcular la longitud de la hipotenusa
     * @param a Base 
     * @param b Altura del triángulo
     * @return Longitud de la hipotenusa
     */
    public static double longitud(double a, double b) {
        return Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)));
    }

    /**
     * Función a evaluar
     * @param x
     * @return 
     */
    public static double evaluar(double x) {
        return Math.pow(x, 2);        
    }

    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.println("Aproximación: [Ej = 0.001]");
        double aprox = lectura.nextDouble();
        System.out.println("Limite inferior: ");
        int inf = lectura.nextInt();
        System.out.println("Limite superior: ");
        int sup = lectura.nextInt();
        
        LinkedList<Valores> valor = generarValores(aprox, inf, sup);
        ListIterator<Valores> iterador = valor.listIterator();

        LinkedList hipotenusa = new LinkedList();
        double l = 0;
        for (int i = 0; i < valor.size(); i++) {
            //System.out.println(valor.get(i)+" "+valor.get(i+1));
            try {
                l += longitud(aprox, valor.get(i + 1).getY() - valor.get(i).getY());
            } catch (Exception e) {
            }
        }
        System.out.println("Longitud: " + l);
    }
}
