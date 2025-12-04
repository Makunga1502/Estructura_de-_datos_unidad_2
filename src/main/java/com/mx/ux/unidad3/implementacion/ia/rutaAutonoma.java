package com.mx.ux.unidad3.implementacion.ia;

import java.util.LinkedList;

public class rutaAutonoma {

    public static void main(String[] args){

        LinkedList<String> rutaActual = new LinkedList<>();
        System.out.println("Planificacion de ruta");
        rutaActual.add("Ciudad A (inicio)");
        rutaActual.add("Ciudad C");
        rutaActual.add("Ciudad D");
        rutaActual.add("Ciudad E (destino)");

        System.out.println("Ruta planificada" + rutaActual);

        String nuevoPunto = "Ciudad B (recarga)";
        int indiceInterseccion =1;
        rutaActual.add(indiceInterseccion,nuevoPunto);

        System.out.println("Ruta planificada" + rutaActual);

        String puntoBloqueado ="Ciudad D (recarga)";
        rutaActual.remove(puntoBloqueado);
         System.out.println("Ruta planificada" + rutaActual);

    }

}
