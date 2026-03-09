package com.mycompany.reservacine;

import java.util.Scanner;

public class ReservaCine {

    public static void main(String[] args) {
        int[][] asientos = new int[3][4];
        Scanner leer = new Scanner(System.in);
        
        System.out.println("SISTEMA DE RESERVAS DE CINE");
        
        try {
            System.out.print("Ingrese fila (0-2): ");
            int f = leer.nextInt();
            
            System.out.print("Ingrese columna (0-3): ");
            int c = leer.nextInt();

            if (f >= 0 && f < 3 && c >= 0 && c < 4) {
                asientos[f][c] = 1;
                System.out.println("\nAsiento [" + f + "][" + c + "] reservado.");
            } else {
                System.out.println("\nError: Posición fuera de rango.");
            }
        } catch (Exception e) {
            System.out.println("Error: Ingrese solo números enteros.");
        }

        System.out.println("\nESTADO DE LA SALA:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(asientos[i][j] + " ");
            }
            System.out.println();
        }
        leer.close();
    }
}