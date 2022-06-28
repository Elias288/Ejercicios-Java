package com.sofka.Ejercicios.Ejercicio18;

public class Ejecutable {
    public static void main(String[] args) {
        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];

        series[0] = new Serie("One Pice", "One");
        series[1] = new Serie("Lupin", 2, "Policial, Misterio", "George Kay");
        series[2] = new Serie();
        series[3] = new Serie("Gambito de dama", "Scott Frank");
        series[4] = new Serie("(Des)encanto", 4, "Comedia", "Matt Groening");
        
        videojuegos[0] = new Videojuego();
        videojuegos[1] = new Videojuego("League of Legends", 1);
        videojuegos[2] = new Videojuego("Doom", 5);
        videojuegos[3] = new Videojuego("Minecraft", 100, "Sandbox", "Mojang");
        videojuegos[4] = new Videojuego("Bioshok", 20, "accion", "2k");

        series[3].entregar();
        series[0].entregar();
        videojuegos[0].entregar();
        videojuegos[3].entregar();
        videojuegos[4].entregar();

        int cantVideojuegosEntregados = 0, cantSeriesEntregadas = 0;
        for (Videojuego e: videojuegos){
            if (e.isEntregado()){
                cantVideojuegosEntregados++;
                e.devolver();
            }
        }
        for (Serie s : series){
            if (s.isEntregado()){
                cantSeriesEntregadas++;
                s.devolver();
            }
        }

        System.out.println("Cantidad de series entregados: "+ cantSeriesEntregadas);
        System.out.println("Cantidad de videjuegos entregados: "+ cantVideojuegosEntregados);

        System.out.println(searchVideojuegoMasComeHoras(videojuegos).toString());
    }
    public static Videojuego searchVideojuegoMasComeHoras (Videojuego[] vs){
        // SETEA EL PRIMER VALOR DEL ARRAY
        Videojuego vMasComeHoras = vs[0];
        // RECORRE EL ARRAY
        for(Videojuego v : vs){
            // SI EL VIDEOJUEGO ACTUAL TIENE MAS HORAS ESTIMADAS LO SETEA
            if (v.getHoras_estimadas()> vMasComeHoras.getHoras_estimadas()){
                vMasComeHoras = v;
            }
        }
        return vMasComeHoras;
    }
}
