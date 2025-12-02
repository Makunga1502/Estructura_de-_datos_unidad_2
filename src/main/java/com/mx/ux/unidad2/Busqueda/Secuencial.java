package com.mx.ux.unidad2.Busqueda;

public class Secuencial {

    public static int busquedaSecuencial(int [] arr, int x){
        int n =  arr.length;
        for (int i = 0; i <n; i++) {
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] datos = {1,4,7,2,5,8,3,6,9};
        int elementoBuscar = 8;
    }
}
