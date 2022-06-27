package com.sofka.Ejercicios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio13 {
    // Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)

    public static void main(String[] args) {
        SimpleDateFormat formato = new SimpleDateFormat("(YYYY/MM/DD) (HH:MM:SS)");
        Date fecha = new Date();
        System.out.println(formato.format(fecha));
    }
}
