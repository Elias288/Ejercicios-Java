package com.sofka.Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
    // Crear un programa que pida un numero por teclado y que imprima por pantalla
    // los números desde el numero introducido hasta 1000 con saldos de 2 en 2.

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero=scann.nextInt();

        while (numero <= 1000){
            System.out.println(numero);
            numero = numero+2;
        }
    }
}
