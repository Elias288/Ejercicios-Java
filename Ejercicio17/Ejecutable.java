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
        electrodomesticos[9] = new Television(19, false, 500, "blanco", 'F', 12);

        int precioFinalLavadoras, precioFinalTv;
        for (Electrodomestico e : electrodomesticos){
            e.precioFinal();
            System.out.println(e.toString());
        }
    }
}
