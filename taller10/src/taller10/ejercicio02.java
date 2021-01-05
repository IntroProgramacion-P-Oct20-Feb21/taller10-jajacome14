/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller10;

import java.util.Scanner;

/**
 *
 * @author JAVIER JACOME
 */
public class ejercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        String vnts = "";
        double[][] ventas = new double[2][5];
        double suma = 0;
        int nombre;
        for (int i = 0; i < vendedores.length; i++) {
            System.out.println("Ingrese 1 para Jessica o 2 para Robert");
            nombre = entrada.nextInt();
            if (nombre == 1) {
                for (int col = 0; col < 5; col++) {
                    System.out.println("Ingrese ventas de Jessica");
                    ventas[0][col] = entrada.nextDouble();
                    suma = suma + ventas[0][col];
                }
            } else {
                for (int col = 0; col < 5; col++) {
                    System.out.println("Ingrese ventas de Robert");
                    ventas[0][col] = entrada.nextDouble();
                    suma = suma + ventas[0][col];
                }

            }
            vnts = String.format("%sVendedores(a) %s\n", vnts, vendedores[i]);
        }
        System.out.printf("%sHan realizado un total de: %.2f en ventas", vnts,
                suma);
    }

}
