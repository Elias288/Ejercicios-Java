package com.sofka.Ejercicios.Ejercicio17;

public class Lavadora extends Electrodomestico{
    final static int CARGA_POR_DEFECTO=5;
    private int carga=CARGA_POR_DEFECTO;

    public Lavadora(){
    }
    public Lavadora(int precio, int peso) {
        super(precio, peso);
    }
    public Lavadora(int carga, int precioBase, String color, char consumoEnergetico, double peso){
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() { return carga; }

    @Override
    public void precioFinal() {
        super.precioFinal();

        // SI LA CARGA ES MAYOR A 30 SE AUMENTA $50
        this.precioFinal += this.carga>30 ? 50 : 0;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                ", " + super.toString() +
                '}';
    }
}
