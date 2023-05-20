
package com.mycompany.poo_ejercicio_19_cap3;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis F Montoya
 */
public class Triangulo {

    //atributos
    double lado,Peri, Area, Altura;

    public void Calculos(double Lado) {
        this.lado = Lado;
        Peri = Lado*3;
        Altura = (Lado * Math.sqrt(3)) / 2;
        Area = (Lado * Altura) / 2;
    }
}
