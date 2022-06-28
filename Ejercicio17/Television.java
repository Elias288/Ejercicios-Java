package com.sofka.Ejercicios.Ejercicio17;

public class Television extends Electrodomestico{
    final static int DEFAULT_INCH = 20;
    final static boolean DEFAULT_TUNER = false;

    private int resolucion = DEFAULT_INCH;
    private boolean sintonizador_TDT = DEFAULT_TUNER;

    public Television() {
    }
    public Television(int precioBase, double peso) {
        super(precioBase, peso);
    }
    public Television(int resolucion, boolean sintonizador_TDT, int precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador_TDT = sintonizador_TDT;
    }

    public int getResolucion() { return resolucion; }
    public boolean isSintonizador_TDT() { return sintonizador_TDT; }

    @Override
    public void precioFinal() {
        super.precioFinal();

        // SI LA RESOLUCION ES MAYOR A 40 SE AUMENTA UN 30%
        this.precioFinal += this.resolucion>40 ? (this.precioFinal * 0.30) : 0;

        // SI TIENE SINTONIZADOR INTEGRADO AUMENTA $50
        this.precioFinal += this.sintonizador_TDT ? 50 : 0;
    }

    @Override
    public String toString() {
        return "Television{" +
                "resolucion=" + resolucion +
                ", sintonizador_TDT=" + sintonizador_TDT +
                ", " + super.toString() +
                '}';
    }
}
