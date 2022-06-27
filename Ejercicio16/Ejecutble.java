package com.sofka.Ejercicios.Ejercicio16;

import java.util.Scanner;

public class Ejecutble {
    // - Pide por teclado el nombre, la edad, sexo, peso y altura.
    // - Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables
    //      pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el
    //      último por defecto, para este último utiliza los métodos set para darle a los atributos un valor.
    // - Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso o por debajo de su peso
    //      ideal con un mensaje.
    // - Indicar para cada objeto si es mayor de edad.
    // - Por último, mostrar la información de cada objeto.

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String nombre;
        int edad;
        char sexo;
        double peso, altura;

        System.out.print("Ingrese nombre: ");
        nombre = scann.nextLine();
        System.out.print("Ingrese edad: ");
        edad = scann.nextInt();
        System.out.print("Ingrese Sexo(H/M): ");
        sexo = scann.next().charAt(0);
        System.out.print("Ingrese peso: ");
        peso = scann.nextDouble();
        System.out.print("Ingrese altura: ");
        altura = scann.nextDouble();

        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);

        Persona p2 = new Persona(nombre, edad, sexo);

        Persona p3 = new Persona();
        p3.setNombre(nombre);
        p3.setEdad(edad);
        p3.setSex(sexo);
        p3.setAltura(altura);
        p3.setPeso(peso);

        int P1MSC=p1.calcularIMC();
        System.out.println("P1 tiene un: " + (P1MSC==1?"Peso ideal":P1MSC==0?"Sobrepeso":"Peso debajo del ideal"));
        System.out.println(p1.esMayorDeEdad()?"Es mayor de edad": "No es mayor de edad");
        System.out.println(p1.toString());

        int P2MSC=p2.calcularIMC();
        System.out.println("P2 tiene un: " + (P2MSC==1?"Peso ideal":P2MSC==0?"Sobrepeso":"Peso debajo del ideal"));
        System.out.println(p2.esMayorDeEdad()?"Es mayor de edad": "No es mayor de edad");
        System.out.println(p2.toString());

        int P3MSC=p3.calcularIMC();
        System.out.println("P3 tiene un: " + (P3MSC==1?"Peso ideal":P3MSC==0?"Sobrepeso":"Peso debajo del ideal"));
        System.out.println(p3.esMayorDeEdad()?"Es mayor de edad": "No es mayor de edad");
        System.out.println(p3.toString());
    }
}
