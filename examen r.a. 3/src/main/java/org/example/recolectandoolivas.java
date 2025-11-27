package org.example;

import java.util.Random;

public class recolectandoolivas {

    public static void main(String[] args) {

        Random aleatorio = new Random();

        System.out.println("Bienvenido al programa ");


        int matriz[][] = new int[8][16];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(5);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int bloq_horizontal = (matriz[0].length/8);
        int bloq_vertical = (matriz.length/8);

        int aux_bloq = 0;

        int aux_8 = 8;
        int aux_ini = 0;
        int aux_ini_vert = 0;
        int aux_8_vert = 8;


        do {
            for (int i = aux_ini; i < aux_8; i++) {
                for (int j = aux_ini_vert; j < aux_8_vert; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            aux_8 += 8;
            aux_ini += 8;
            aux_bloq++;
            if (aux_bloq == bloq_vertical) {
                aux_bloq = 0;
                aux_ini_vert += 8;
                aux_8_vert += 8;
                aux_8 = 8;
                aux_ini = 0;
            }
        } while (aux_8 <= matriz.length && aux_8_vert <= matriz[0].length);

    }
}