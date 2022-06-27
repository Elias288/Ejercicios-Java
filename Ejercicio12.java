package com.sofka.Ejercicios;

import java.util.List;
import java.util.Scanner;

public class Ejercicio12 {
    // Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.

    public static String diferencias(String texto1, String texto2){
        String res="";
        if(texto1.length()!=texto2.length()){
            res+= "Sus largos son diferentes\n";
        }else{
            String[] t1=texto1.split(" "), t2=texto2.split(" ");

            for (int i=0; i<=t1.length-1; i++){
                if(!t1[i].equals(t2[i])){
                    res+=t1[i] +" es distinto que: " + t2[i] + "\n";
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        String texto1, texto2;

        System.out.print("Ingrese la primera palabra: ");
        texto1=captura.nextLine();
        System.out.print("Ingrese la segunda palabra: ");
        texto2=captura.nextLine();

        if(texto1.equals(texto2)){
            System.out.println("son iguales");
        }else{
            System.out.println("son diferentes");
            System.out.println(diferencias(texto1, texto2));
        }
    }
}
