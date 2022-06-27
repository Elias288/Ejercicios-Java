package com.sofka.Ejercicios;

import java.util.Scanner;

public class Ejercicio04 {
    // Lee un número por teclado que pida el precio de un producto (puede tener decimales)
    // y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.

    public double estoNoDeberiaExistir(double dinero){
        return 0.21*dinero;
    }

    public static void main(String[] args) {
        double precio;
        Ejercicio04 app = new Ejercicio04();
        Scanner captura = new Scanner(System.in);

        System.out.print("Ingrese el precio de un producto: ");
        precio=Double.parseDouble(captura.nextLine());

        System.out.println("El precio final es: $" + (precio + app.estoNoDeberiaExistir(precio)) );
    }
}
