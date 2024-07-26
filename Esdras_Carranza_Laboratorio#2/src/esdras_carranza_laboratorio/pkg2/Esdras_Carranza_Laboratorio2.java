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
        int validar_cant = 0, validar_nota = 0, suma_nota = 0;
        String cadena;
        double promedio = 0, nota_mayor, nota_menor;
        
        info.useDelimiter("\n");

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
                // Validar la cantidad de notas
                while (validar_cant == 0) {
                    System.out.println("Ingrese la cantidad de notas: ");
                    cant_nota = info.nextInt();
                    if (cant_nota > 0) {
                        validar_cant = 1;
                    } else {
                        System.out.println("La cantidad de notas debe ser un valor positivo.");
                    }
                }

                // Leer la primera nota para inicializar nota_mayor y nota_menor
                System.out.println("Nota# 1: ");
                nota = info.nextInt();
                while (nota < 0 || nota > 100) {
                    System.out.println("Nota invalida. Ingrese una nota entre 0 y 100.");
                    nota = info.nextInt();
                }
                nota_mayor = nota;
                nota_menor = nota;
                suma_nota = nota;

                contador = 1;

                // Ingresar y validar el resto de las notas
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

                    if (nota > nota_mayor) {
                        nota_mayor = nota;
                    }
                    if (nota < nota_menor) {
                        nota_menor = nota;
                    }

                    contador++;
                }

                // Calcular el promedio
                promedio = suma_nota / cant_nota;

                // Imprimir resultados con formato adecuado
                System.out.printf("Promedio: %.2f %%\n", promedio);
                System.out.printf("Nota mayor: %.2f\n", nota_mayor);
                System.out.printf("Nota menor: %.2f\n", nota_menor);

            } else if (opcion == 3) {

                System.out.println("Ingrese la fecha actual en formato \"dia, DD/MM\":");
                String entrada = info.next().trim();

                if (!entrada.matches("[a-zA-Z]+, \\d{2}/\\d{2}")) {
                    System.out.println("Error: Formato de fecha incorrecto.");
                    return;
                }

                String diaSemana = entrada.substring(0, entrada.indexOf(',')).trim().toLowerCase();
                String fecha = entrada.substring(entrada.indexOf(',') + 1).trim();

                int dia = Integer.parseInt(fecha.substring(0, 2));
                int mes = Integer.parseInt(fecha.substring(3, 5));

                if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
                    System.out.println("Error: Dia o mes fuera de rango.");
                    return;
                }

                if (diaSemana.equals("lunes")) {
                    System.out.println("Se tomaron examenes (si/no)");
                    String examen = info.next().trim().toLowerCase();

                    if (examen.equals("si")) {
                        System.out.println("Ingrese la cantidad de alumnos aprobados:");
                        int aprobados = info.nextInt();
                        System.out.println("Ingrese la cantidad de alumnos no aprobados:");
                        int noAprobados = info.nextInt();
                        info.next();

                        if (aprobados + noAprobados > 0) {
                            double porcentajeAprobados = (double) aprobados / (aprobados + noAprobados) * 100;
                            System.out.printf("Porcentaje de aprobados: %.2f%%\n", porcentajeAprobados);
                        } else {
                            System.out.println("Error: La cantidad de alumnos no puede ser cero.");
                        }
                    } else if (!examen.equals("no")) {
                        System.out.println("Error: Respuesta invalida.");
                    }

                } else if (diaSemana.equals("martes")) {
                    System.out.println("Se tomaron examenes (si/no)");
                    String examen = info.next().trim().toLowerCase();

                    if (examen.equals("si")) {
                        System.out.println("Ingrese la cantidad de alumnos aprobados:");
                        int aprobados = info.nextInt();
                        System.out.println("Ingrese la cantidad de alumnos no aprobados:");
                        int noAprobados = info.nextInt();
                        info.next();

                        if (aprobados + noAprobados > 0) {
                            double porcentajeAprobados = (double) aprobados / (aprobados + noAprobados) * 100;
                            System.out.printf("Porcentaje de aprobados: %.2f%%\n", porcentajeAprobados);
                        } else {
                            System.out.println("Error: La cantidad de alumnos no puede ser cero.");
                        }
                    } else if (!examen.equals("no")) {
                        System.out.println("Error: Respuesta invalida.");
                    }

                } else if (diaSemana.equals("miercoles")) {
                    System.out.println("Se tomaron examenes (si/no)");
                    String examen = info.next().trim().toLowerCase();

                    if (examen.equals("si")) {
                        System.out.println("Ingrese la cantidad de alumnos aprobados:");
                        int aprobados = info.nextInt();
                        System.out.println("Ingrese la cantidad de alumnos no aprobados:");
                        int noAprobados = info.nextInt();
                        info.next();

                        if (aprobados + noAprobados > 0) {
                            double porcentajeAprobados = (double) aprobados / (aprobados + noAprobados) * 100;
                            System.out.printf("Porcentaje de aprobados: %.2f%%\n", porcentajeAprobados);
                        } else {
                            System.out.println("Error: La cantidad de alumnos no puede ser cero.");
                        }
                    } else if (!examen.equals("no")) {
                        System.out.println("Error: Respuesta invalida.");
                    }

                } else if (diaSemana.equals("jueves")) {
                    System.out.println("Ingrese el porcentaje de asistencia a clase:");
                    double asistencia = info.nextDouble();
                    info.next();

                    if (asistencia > 50) {
                        System.out.println("Asistio la mayoria.");
                    } else {
                        System.out.println("No asistio la mayoria.");
                    }

                } else if (diaSemana.equals("viernes")) {
                    if (dia == 1 && (mes == 1 || mes == 7)) {
                        System.out.println("Comienzo de nuevo ciclo.");
                        System.out.println("Ingrese la cantidad de alumnos del nuevo ciclo:");
                        int cantidadAlumnos = info.nextInt();
                        System.out.println("Ingrese el precio por alumno :");
                        double precioPorAlumno = info.nextDouble();
                        info.next();

                        double ingresoTotal = cantidadAlumnos * precioPorAlumno;
                        System.out.printf("Ingreso total: %.2f $\n", ingresoTotal);
                    }

                } else {
                    System.out.println("Error: Dia de la semana inexistente.");
                }

            }
        }
    }

}
//  System.out.println("nota # " + contador + ": ");
//                    nota = info.nextInt();
//                    
