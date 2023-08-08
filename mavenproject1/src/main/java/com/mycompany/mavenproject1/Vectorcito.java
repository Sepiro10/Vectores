package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Vectorcito {
    private int[] v;
    private int espacio;

    public Vectorcito(int espacio) {
        this.espacio = espacio;
        v = new int[espacio];
    }

    public void cargarVectorcito() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < espacio; i++) {
            v[i] = scanner.nextInt();
        }
    }
    
    public void invertirVectorcito() {
        int a = 0;
        int b = espacio - 1;
        while (a < b) {
            int c = v[a];
            v[a] = v[b];
            v[b] = c;
            a++;
            b--;
        }
    }
      
    public void imprimirVectorcito() {
        for (int i = 0; i < espacio; i++) {
            System.out.print(v[i] + " ");
        }
        }
}
