package com.sofka.Ejercicios;

import java.util.Scanner;

public class Ejercicio03 {
    // Haz una aplicación que calcule el área de un círculo(pi*R2).
    // El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
    // Usa la constante PI y el método pow de Math.

    public double calcArea (double R2) {return Math.PI*R2;}

    public static void main(String[] args) {
        Ejercicio03 app = new Ejercicio03();
        Scanner captura = new Scanner(System.in);
        String radio;

        System.out.print("Ingresa el radio del círculo a calcular: ");
        radio = captura.nextLine();

        System.out.println(app.calcArea(Double.parseDouble(radio)));
    }
}
