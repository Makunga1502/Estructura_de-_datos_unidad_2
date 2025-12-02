package com.mx.ux.unidad2;

// Ejemplo de ordenamiento por selección en Java
class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Se recorre el arreglo
        for (int i = 0; i < n - 1; i++) {
            // Encuentra el índice del elemento más pequeño
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Intercambia el elemento más pequeño con el primer elemento
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Método para imprimir el arreglo
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Arreglo ordenado:");
        printArray(arr);
    }
}
