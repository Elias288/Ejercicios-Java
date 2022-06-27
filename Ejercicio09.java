package com.sofka.Ejercicios;

import java.util.Scanner;

public class Ejercicio09 {
    // Del texto, La sonrisa sera la mejor arma contra la tristeza Reemplaza todas
    // las a del String anterior por una e, adicionalmente concatenar a esta frase una
    // adicional que ustedes quieran incluir por consola y las muestre luego unidas.

    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        String texto="La sonrisa sera la mejor arma contra la tristeza ";

        System.out.print("/>");
        String frase = captura.nextLine();
        texto += frase;
        String textoSinA=texto.replace('a', 'e');

        System.out.println(textoSinA);
    }
}
