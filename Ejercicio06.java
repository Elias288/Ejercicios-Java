package com.sofka.Ejercicios;

public class Ejercicio06 {
    // Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle for.

    public boolean impares (int n) {
        return n%2 != 0;
    }
    public static void main(String[] args) {
        Ejercicio06 app = new Ejercicio06();

        for (int i=1; i<=100; i++){
            System.out.println(i%2 == 0 ? "Par: " + i: "Impar: " + i);
        }
    }
}
