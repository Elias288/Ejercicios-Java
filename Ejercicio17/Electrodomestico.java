package com.sofka.Ejercicios.Ejercicio17;

import java.util.*;

public class Electrodomestico {
    // CONSTANTES
    final static char[] CE={'A', 'B', 'C', 'D', 'E', 'F'};
    final static String[] COLORS={"blanco", "negro", "rojo", "azul", "gris"};
    final static Integer PB=100;
    final static double PESO=5;

    static final Map<String, Integer> CEmap;
    static {
        CEmap = new HashMap<>();
        CEmap.put("A", 100);
        CEmap.put("B", 80);
        CEmap.put("C", 60);
        CEmap.put("D", 50);
        CEmap.put("E", 30);
        CEmap.put("F", 10);
    }

    // ATRIBUTOS
    protected int precioBase = PB;
    protected int precioFinal = 0;
    protected String color = COLORS[0];
    protected char consumoEnergetico = CE[5];
    protected double peso = PESO;

    // METODOS
    public Electrodomestico() {
    }
    public Electrodomestico(int precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }
    public Electrodomestico(int precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public int getPrecioBase() { return precioBase; }
    public String getColor() { return color; }
    public char getConsumoEnergetico() { return consumoEnergetico; }
    public double getPeso() { return peso; }
    public int getPrecioFinal(){ return precioFinal; }
    public static char comprobarConsumoEnergetico(char letra){
        int p=new String(CE).indexOf(letra);
        return p!=-1?CE[p]:CE[5];
    }
    public static String comprobarColor(String color){
        List<String> colors = Arrays.asList(COLORS);
        int p=colors.indexOf(color.toLowerCase(Locale.ROOT));

        return p!=-1 ? COLORS[p] : COLORS[0];
    }
    public static int aumentoTam(double tamanio){
        return tamanio<=19 ? 10 : tamanio >= 20 && tamanio<=49 ? 50 : tamanio>=50 && tamanio<=79 ? 80 : 100;
    }
    public void precioFinal(){
        // EL PRECIO ES EL PRECIO BASE MAS LOS AUMENTOS
        this.precioFinal = this.precioBase;

        // AUMENTO DEL PRECIO POR SU CONSUMO ENERGETICO
        this.precioFinal += CEmap.get(String.valueOf(this.consumoEnergetico));

        // AUMENTO DEL PRECIO POR SU PESO
        this.precioFinal += aumentoTam(this.peso);
    }

    @Override
    public String toString() {
        return "precioBase=" + precioBase +
                ", precioFinal=" + precioFinal +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso;
    }
}
