/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author spine
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vectorcito: ");
        int tamaño = sc.nextInt();
        Vectorcito vector = new Vectorcito(tamaño);
        
        System.out.println("Ingrese " + tamaño + " elementos del vector:");
        vector.cargarVectorcito();

        System.out.println("\nVector original:");
        vector.imprimirVectorcito();

        vector.invertirVectorcito();

        System.out.println("\nVector invertido:");
        vector.imprimirVectorcito();
    }
}

