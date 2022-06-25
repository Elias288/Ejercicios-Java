package com.sofka.Ejercicios;

public class Ejercicio1 {
    //Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
    // Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.

    public boolean mayorQue(int a, int b){
        return a > b;
    }
    public boolean menorQue(int a, int b){
        return a < b;
    }
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        Ejercicio1 app = new Ejercicio1();

        System.out.println("num1 es mayor que num2: "+app.mayorQue(num1, num2));
        System.out.println("num1 es menor que num2: "+app.menorQue(num1, num2));
    }
}
