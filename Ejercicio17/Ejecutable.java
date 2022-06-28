package com.sofka.Ejercicios.Ejercicio17;

public class Ejecutable {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        electrodomesticos[0] = new Lavadora();
        electrodomesticos[1] = new Lavadora(100, 5);
        electrodomesticos[2] = new Lavadora(10, 120, "Negro",'E', 15);
        electrodomesticos[3] = new Lavadora(90, 4);
        electrodomesticos[4] = new Lavadora(50, 200, "Rojo",'F', 65);

        electrodomesticos[5] = new Television(45, true, 250, "azul", 'B', 14);
        electrodomesticos[6] = new Television(170, 20);
        electrodomesticos[7] = new Television();
        electrodomesticos[8] = new Television(30, false, 180, "gris", 'C', 19);
        electrodomesticos[9] = new Electrodomestico(120, "Negro", 'A', 8);

        int precioFinalElectrodomesticos=0, precioFinalLavadoras=0, precioFinalTv=0;
        for (Electrodomestico e : electrodomesticos){
            e.precioFinal();
            // TODOS
            precioFinalElectrodomesticos += e.getPrecioFinal();
            // LAVADORAS
            if (e instanceof Lavadora) {
                precioFinalLavadoras += e.getPrecioFinal();
            }
            // TELEVISIONES
            if (e instanceof Television) {
                precioFinalTv += e.getPrecioFinal();
            }
        }

        System.out.println("Total precio de lavadoras: $" + precioFinalLavadoras);
        System.out.println("Total precio de televisores: $" + precioFinalTv);
        System.out.println("Total precio de electrodomesticos: $" + precioFinalElectrodomesticos);
    }
}
