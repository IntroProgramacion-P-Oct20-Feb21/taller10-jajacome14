/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller10;

/**
 *
 * @author JAVIER JACOME
 */
public class ejercicio01 {

    public static void main(String[] args) {
        // TODO code application logic here
        double[][] notas = {{9, 10, 7, 8}, {10, 5, 7, 8}, {7, 9.4, 10, 9}};
        double valor = 0;
        String[] estudiantes = {"Jerry Ponce", "Grabiela Levis", "David Vell"};
        String est = "";

        for (int es = 0; es < estudiantes.length; es++) {
            est = estudiantes[es];
            for (int fila = 0; fila < notas.length; fila++) {
                double suma = 0;
                for (int col = 0; col < notas[fila].length; col++) {
                    suma = suma + notas[fila][col];
                    valor = suma / notas[fila].length;
                }

            }
            System.out.printf("Estudiante: %s tiene  un Promedio de: %.2f\n",
                    est, valor);
        }
    }

}
