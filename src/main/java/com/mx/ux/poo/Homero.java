package com.mx.ux.poo;

public class Homero {
    private String matricula;
    private String nombre;
    private String sobrio;

    public Homero(){
        System.out.println("Homero creado");
    }
    public void trabajosHomero(){
        System.out.println("Homero se ha metido a trabajar");
    }
    public double  pagoMensualidad(){
        return 1500.00;
    }
    public int calcularHorasTrabajo(int horasPorDia, int diasSemana){
        return horasPorDia * diasSemana;
    }

    public static void main(String[] args) {
        //Crear un objeto de la clase Alumno
        Homero homero = new Homero();
        homero.trabajosHomero();
        System.out.println("Mensualidad: "+ homero.pagoMensualidad());

        //crear un segundo alumno
        Alumno alumno2 = new Alumno();
        alumno2.inscripcionCurso();
        alumno2.pagoMensualidad();
        alumno2.inscripcionTaller();
    }
}
