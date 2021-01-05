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
public class ejercicio05 {

    public static void main(String[] args) {
        // TODO code application logic here
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}};
        String inicial;
        String cadena_final = "";

        for (int fila = 0; fila < estudiantes.length; fila++) {
            for (int columna = 0; columna < 2; columna++) {
                inicial = estudiantes[fila][columna].substring(0, 1);
                if (inicial.equals("S") || (inicial.equals("P"))
                        || (inicial.equals("T"))) {
                    cadena_final = String.format("%s%s\n", cadena_final,
                            estudiantes[fila][columna]);

                }

            }
        }
        System.out.printf("los estudiantes son:\n" + "%s", cadena_final);
    }

}
