package com.mx.ux.poo;

public class Alumno {
    private String matricula;
    private String nombre;

    public Alumno(){
        System.out.println("Alumno creado");
    }
    public void inscripcionCurso(){
        System.out.println("El alumno se ha inscrito al curso");
    }
    public void inscripcionTaller(){
        System.out.println("Alumno inscrito al taller de Base de datos");
    }
    public double  pagoMensualidad(){
        return 1500.00;
    }

    public int calcularHorasTrabajo(int horasPorDia, int diasSemana){
        return horasPorDia * diasSemana;
    }

    public static void main(String[] args) {
        //Crear un objeto de la clase Alumno
        Alumno alumno = new Alumno();
        alumno.inscripcionCurso();
        alumno.inscripcionTaller();
        System.out.println("Mensualidad: "+ alumno.pagoMensualidad());

        //crear un segundo alumno
        Alumno alumno2 = new Alumno();
        alumno2.inscripcionCurso();
        alumno2.pagoMensualidad();
        alumno2.inscripcionTaller();
    }
}
