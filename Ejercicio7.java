package com.sofka.Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    // Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
    // si no lo es lo volverá a pedir (do while), después muestra ese número por consola.

    public static void main(String[] args) {
        int num = 0;
        Scanner captura = new Scanner(System.in);

        while(num >= 0){
            System.out.println("Ingrese un numero:");
            num = Integer.parseInt(captura.nextLine());
        }
    }
}
