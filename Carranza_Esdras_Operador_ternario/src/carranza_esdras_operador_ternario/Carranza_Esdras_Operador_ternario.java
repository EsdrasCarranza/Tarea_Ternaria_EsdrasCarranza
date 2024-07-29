/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carranza_esdras_operador_ternario;
import   java.util.Scanner;
/**
 *
 * @author 50488
 */
public class Carranza_Esdras_Operador_ternario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner info = new Scanner(System.in);
        
        info.useDelimiter("\n");
        
        /*
        El operador ternario en Java es una construcción
        que permite tomar decisiones basadas en una condición booleana,
        de manera concisa en una sola línea de código. 
        Es una forma abreviada de expresar una estructura condicional (if-else).
        */
        
        System.out.println("Ejemplo con valores constantes");
        
        int edad = 18, temperatura_ambiente = 28;
      
        String ciudadano_honduras = (edad>=21) ? "eres ciudadano hondureño" : "No eres ciudadano hondureño aun";
        
        System.out.println("tu" + ciudadano_honduras);
        
        System.out.println("Ejemplos con variables");
        
        System.out.println("Ingrese la temperatura donde vive: ");
        int temperatura = info.nextInt();
        
        
        String condiciones_temp = (temperatura > temperatura_ambiente) ? "la temperatura de donde vive es mayor a la temperatura ambiente" : "la temperatura de donde vive no es mayor a la temperatura ambiente";
        System.out.println(condiciones_temp);
        
        System.out.println("Ejemplos formulas");
        System.out.println("Calculo de exceso de velocidad: ");
        System.out.println(" ");
        System.out.println("Ingrese la distncia que recorrio: ");
        int distancia= info.nextInt();
        System.out.println("Ingrese en el tiempo que la recorrio: ");
        int tiempo = info.nextInt();
        
        int velocidad =distancia  / tiempo;
        
        String exceso_velocidad= (velocidad > 80) ? "Excedio el limite de velocidad en Honduras cuidado!!!" : "No excedio el limite de velocidad en Honduras";
        
        System.out.println("Usted " + exceso_velocidad);
    }
    
}
