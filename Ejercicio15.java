package com.sofka.Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
    //1-NUEVO ACTOR
    //2-BUSCAR ACTOR
    //3-ELIMINAR ACTOR
    //
    //
    //
    //
    //

    public static void main(String[] args) {
        int op=0;
        Scanner scann = new Scanner(System.in);

        while (op!=8){
            System.out.println("****** GESTION CINEMATOGRÁFICA ********");
            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("6- VER PELICULAS DE LOS ACTORES");
            System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8-SALIR");
            op=scann.nextInt();
            switch (op) {
                case 1:
                    System.out.println("opcion 1 seleccionada");
                    break;
                case 2:
                    System.out.println("opcion 2 seleccionada");
                    break;
                case 3:
                    System.out.println("opcion 3 seleccionada");
                    break;
                case 4:
                    System.out.println("opcion 4 seleccionada");
                    break;
                case 5:
                    System.out.println("opcion 5 seleccionada");
                    break;
                case 6:
                    System.out.println("opcion 6 seleccionada");
                    break;
                case 7:
                    System.out.println("opcion 7 seleccionada");
                    break;
                case 8:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println(" OPCION INCORRECTO");
            }
        }
    }
}
