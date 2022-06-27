package com.sofka.Ejercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio11 {
    // Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola,
    // indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene de a,e,i,o,u.

    public int cantidadVocales(String texto){
        int count=0;
        String[] t=texto.split("");

        for (String s : t) {
            if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        Ejercicio11 app = new Ejercicio11();

        System.out.print("/>");
        String texto = captura.nextLine();

        System.out.println("La longitudo del texto es: "+texto.length());
        System.out.println("La cantidad de vocales es: "+app.cantidadVocales(texto));
    }
}
