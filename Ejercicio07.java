package com.sofka.Ejercicios;

import java.util.Scanner;

public class Ejercicio07 {
    // Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
    // si no lo es lo volverá a pedir (do while), después muestra ese número por consola.

    public static void main(String[] args) {
        int num;
        Scanner captura = new Scanner(System.in);

        do {
            System.out.println("Ingrese un numero:");
            num = Integer.parseInt(captura.nextLine());
        } while(num < 0);
    }
}
