package com.mx.ux.unidad2;

public class burbuja2 {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Bucle externo para las pasadas completas
        for (int i = 0; i < n - 1; i++) {
            // Bucle interno para comparar y mover los elementos más grandes al final
            for (int j = 0; j < n - i - 1; j++) {
                // Si el elemento actual es mayor que el siguiente, se intercambian
                if (arr[j] > arr[j + 1]) {
                    // Intercambio de elementos
                    System.out.println("Intercambio");
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] datos = {8,5,12,1};

        System.out.println("Arreglo original:");
        for (int dato : datos) {
            System.out.print(dato + " ");
        }

        bubbleSort(datos);

        System.out.println("\nArreglo ordenado:");
        for (int dato : datos) {
            System.out.print(dato + " ");
        }
    }
}