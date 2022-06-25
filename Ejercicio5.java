package com.sofka.Ejercicios;

public class Ejercicio5 {
    // Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.

    public boolean impares (int n) {
        return n%2 != 0;
    }

    public static void main(String[] args) {
        int i = 1;
        Ejercicio5 app = new Ejercicio5();

        while ( i <= 100){
            if(app.impares(i)){
                System.out.println(i);
            }
            i++;
        }
    }
}
