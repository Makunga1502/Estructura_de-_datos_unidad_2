package com.mx.ux.unidad3.lista.simple;

public class listaenlazada {

    //Referencia l primer nodo de la lista
    Nodo cabeza;

    public listaenlazada(){
        this.cabeza=null;
    }

    public void insertarAlInicio (int nuevoDato){

        //Creamos un nuedo nodo
        Nodo nuevoNodo = new Nodo(nuevoDato);
        nuevoNodo.siguiente = cabeza;

        cabeza = nuevoNodo;
        System.out.println("Insertando a inicio" + nuevoDato);
    }

    public void insertarAlFinal (int nuevoDato){
        Nodo nuevoNodo = new Nodo(nuevoDato);

        //si la lista esta vacia, el nuevo nodo es la cabeza
        if(cabeza==null){
            cabeza= nuevoNodo;
            System.out.println("Insertando al final (Lista vacia)"+ nuevoDato);
            return;
        }

        //si la lista no esta vacia, recorrer hasta el ultimo nodo
        Nodo actual = cabeza;
        while(actual.siguiente !=null){
            actual = actual.siguiente;
        }
        //el ultimo nodo apuntando al nuevo nodo
        actual.siguiente = nuevoNodo;
        System.out.println("Insertando al final"+nuevoDato);

    public void imprimirLista(){
        Nodo actual = cabeza;
        System.out.println("Lista simple");

        while (actual ! = null){
            System.out.println(actual.dato + "->");
            actual = actual.siguiente;
            }
        System.out.println("Null");
        }

    }
}
