package com.sofka.Ejercicios.Ejercicio16;

import java.util.Random;

public class Persona {
    private String nombre;
    private Integer edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    public static final char Male='H';
    public static final char Female='M';
    public static final Integer INF = -1;
    public static final Integer IDEAL = 0;
    public static final Integer SOBREPESO = 1;

    Persona(){
        this.nombre="";
        this.edad=0;
        this.DNI=generaDNI();
        this.sexo='M';
        this.peso=0;
        this.altura=0;
    }
    Persona(String nombre, Integer edad, char sexo){
        this.nombre=nombre;
        this.DNI=generaDNI();
        this.edad=edad;
        this.sexo=comprobarSexo(sexo);
        this.peso=0;
        this.altura=0;
    }
    Persona(String nombre, Integer edad, char sexo, double peso, double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=comprobarSexo(sexo);
        this.peso=peso;
        this.altura=altura;
        this.DNI=generaDNI();
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public char getSexo(){ return this.sexo; }
    public void setSex(char s){ this.sexo=s; }

    public Integer getEdad(){ return this.edad; }
    public void setEdad(Integer e){ this.edad=e; }

    public String getDNI(){ return this.DNI; }
    public static String generaDNI(){
        String caracteres="RIFDKIERAEBKFSOHOHEFWQD";
        Random rnd = new Random();
        int preDNI=rnd.nextInt(99999999);

        int modulo=preDNI%23;
        char letra=caracteres.charAt(modulo);
        return preDNI + "" + letra;
    }

    public double getPeso(){ return this.peso; }
    public void setPeso(double p){ this.peso=p; }

    public double getAltura(){ return this.altura; }
    public void setAltura(double a){ this.altura=a; }

    public int calcularIMC(){
        double imc = this.peso/(Math.pow(this.altura, 2));
        return imc<20?INF:imc>=20 && imc<=25?IDEAL:SOBREPESO;
    }
    public boolean esMayorDeEdad(){
        return this.edad>18?true:false;
    }
    static char comprobarSexo(char sexo){
        return sexo==Male || sexo==Female?sexo:Male;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
