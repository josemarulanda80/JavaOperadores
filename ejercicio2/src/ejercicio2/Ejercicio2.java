/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        
        float salario,horas,total;
        
        System.out.println("Ingrese el valor de la hora salirio");
        salario= entry.nextFloat();
        
        System.out.println("Ingrese el numero de horas trabajadas");
        horas = entry.nextFloat();
        
        total=salario*horas;
        System.out.println("el salario total es de;" + total);
        
        
        
 
        
        
                
                
    }
    
}
