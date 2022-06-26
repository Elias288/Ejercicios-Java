package com.sofka.Ejercicios;

public class Ejercicio6 {
    // Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle for.

    public boolean impares (int n) {
        return n%2 != 0;
    }

    public static void main(String[] args) {
        Ejercicio6 app = new Ejercicio6();

        for (int i=1; i<=100; i++){
            if(app.impares(i)){
                System.out.println(i);
            }
        }
    }
}
