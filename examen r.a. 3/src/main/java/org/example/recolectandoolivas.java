package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class recolectandoolivas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int doslitros = 0;
         int kg = 0;
        System.out.println("Bienvenido al programa para verdaderos agricultores");
        System.out.println("Porfavor introduzca el ancho y alto de este maravilloso compo de olivos");
        System.out.println("*************************************");
        System.out.println("primero introduzca el ancho porfavor");
        int ancho = entrada.nextInt();
        System.out.println("*************************************");
        System.out.println("ahora introduzca la altura");
        int alto = entrada.nextInt();
        System.out.println("*************************************");
        System.out.println("ahora por hileras rellena los kg de olivas por arbol de tu bancal");


        int matriz[][] = new int[alto][ancho];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = entrada.nextInt();
                kg += matriz[i][j];
                kg = doslitros;
                doslitros = matriz[i][j] / 8;
                }
            }


        System.out.println("Este es es el mapa de tu campo de olivos");
        System.out.println("*************************************");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int litros = kg / 8;

        System.out.println("*************************************");
        System.out.println("El total de kg es: " + kg);
        System.out.println("*************************************");
        System.out.println("El total de litros es:"  + litros);
        System.out.println("*************************************");
        System.out.println("El total de litros por hilera:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Hilera " + ++i);

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(litros);

            }
            System.out.println();
        }
        System.out.println();



    }
}