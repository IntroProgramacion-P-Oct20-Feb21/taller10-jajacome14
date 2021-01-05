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
public class ejercicio04 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double[][] datos = new double[2][2];
        double cad = 0;
        double cad2 = 0;
        String cadena = "";
        for (int fila = 0; fila < datos.length; fila++) {
            for (int col = 0; col < datos[fila].length; col++) {
                System.out.println("Ingrese lo valores");
                datos[fila][col] = entrada.nextDouble();
                cad = datos[fila][col];
                cadena = String.format("%s%.2f\n", cadena, cad);
            }
        }
        System.out.println(cadena);
    }
    
}
