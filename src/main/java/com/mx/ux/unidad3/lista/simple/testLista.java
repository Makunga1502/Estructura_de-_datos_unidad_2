package com.mx.ux.unidad3.lista.simple;

public class testLista {

    public static void main(String[] args) {
        //crear una instancia de lista enlazada
        listaenlazada lista = new listaenlazada();

        System.out.println("Insertar nuevo datos");
        lista.insertarAlInicio(10);
        lista.insertarAlInicio(20);

        System.out.println("Insertar al final");
        lista.insertarAlFinal(30);
        lista.insertarAlInicio(40);

        lista.insertarAlInicio(50);

        lista.imprimirLista();
    }
}
