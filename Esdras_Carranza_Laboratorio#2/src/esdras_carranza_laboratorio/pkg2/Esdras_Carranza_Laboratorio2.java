/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package esdras_carranza_laboratorio.pkg2;

import java.util.Scanner;

/**
 *
 * @author 50488
 */
public class Esdras_Carranza_Laboratorio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

         int opcion = 0, i = 0, contador_actual = 0, contador_caracter = 0, cant_nota = 0, contador = 0, nota = 0;
        int validar_cant = 0, validar_nota = 0,suma_nota = 0;
        String cadena;
        double promedio = 0;

        while (opcion != 4) {
            System.out.println("1.Cadena " + "\n" + "2.notas" + "\n" + "3.clases" + " \n" + "4.salir" + "\n" + "Ingrese la opcion que necesite: ");
            opcion = info.nextInt();

            if (opcion == 1) {
                System.out.println("Ejercicio#1 cadenas");
                System.out.println("Ingrese una cadena de texto:");
                cadena = info.next();

                int longitud = cadena.length();
                int max_repeticiones = 0;
                char caracterMasRepetido = ' ';
                char caracter = 0;

                while (caracter < 256) {
                    contador_actual = 0;
                    contador_caracter = 0;

                    while (contador_caracter < longitud) {
                        if (cadena.charAt(contador_caracter) == caracter) {
                            contador_actual++;
                        }
                        contador_caracter++;
                    }

                    if (contador_actual > max_repeticiones) {
                        max_repeticiones = contador_actual;
                        caracterMasRepetido = caracter;
                    }

                    caracter++;
                }

                System.out.println("El caracter que mas se repite es: " + caracterMasRepetido);
                System.out.println("Numero de veces que se repite: " + max_repeticiones);

            } else if (opcion == 2) {
                validar_cant = 0; 

                while (validar_cant == 0) {
                    System.out.println("Ingrese la cantidad de notas: ");
                    cant_nota = info.nextInt();
                    if (cant_nota > 0) {
                        validar_cant = 1;
                    }
                }

                contador = 0; 

                while (contador < cant_nota) {
                    validar_nota = 0; 

                    while (validar_nota == 0) {
                        System.out.println("Nota# " + (contador + 1) + ": ");
                        nota = info.nextInt();
                        if (nota >= 0 && nota <= 100) {
                            validar_nota = 1;
                        } else {
                            System.out.println("Nota invalida. Ingrese una nota entre 0 y 100.");
                        }
                    }
                    suma_nota += nota;
                    contador++;
                    
                }
                promedio = suma_nota / cant_nota;
                System.out.println("promedio: " +  promedio + " ");

            }else if (opcion == 3){
                
            }
        }
    }

}
//  System.out.println("nota # " + contador + ": ");
//                    nota = info.nextInt();
//                    
