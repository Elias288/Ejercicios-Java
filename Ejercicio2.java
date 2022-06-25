package com.sofka.Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    //Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores, menores o iguales.

    public boolean mayorQue(int a, int b){
        return a > b;
    }
    public boolean menorQue(int a, int b){
        return a < b;
    }

    public static void main(String[] args) {
        int num1;
        int num2;
        Ejercicio2 app = new Ejercicio2();
        Scanner captura = new Scanner(System.in);

        System.out.print("ingresa el primer valor: ");
        num1 = Integer.parseInt(captura.nextLine());
        System.out.print("ingresa el segundo valor: ");
        num2 = Integer.parseInt(captura.nextLine());

        System.out.println("num1 es mayor que num2: "+app.mayorQue(num1, num2));
        System.out.println("num1 es menor que num2: "+app.menorQue(num1, num2));
    }
}
