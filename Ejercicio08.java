package com.sofka.Ejercicios;

import java.util.*;

public class Ejercicio08 {
    // Crea una aplicación por consola que nos pida un día de la semana y que nos
    // diga si es un día laboral o no. Usa un switch para ello.

    public int buscarDiaLaborable(String dia){
        String d=dia.toLowerCase();
        switch (d){
            case "lunes":
                return 1;
            case "martes":
                return 1;
            case "miercoles":
                return 1;
            case "jueves":
                return 1;
            case "viernes":
                return 1;
            case "sabado":
                return 0;
            case "domingo":
                return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        String dia;
        Scanner captura = new Scanner(System.in);
        Ejercicio08 app = new Ejercicio08();

        System.out.println("Ingresa un día: ");
        dia=captura.nextLine();

        int res=app.buscarDiaLaborable(dia);
        System.out.println(res==1?"El día es laborable":res==0?"El día no es laborable":"Dato ingresado no valido");
    }
}
