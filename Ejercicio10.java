package com.sofka.Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    // Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.

    public static void main(String[] args) {
        String texto;
        Scanner captura = new Scanner(System.in);

        System.out.printf("/>");
        texto=captura.nextLine();
        System.out.println(texto.replace(" ", ""));
    }
}
