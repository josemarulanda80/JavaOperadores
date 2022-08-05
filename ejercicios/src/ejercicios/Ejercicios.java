/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        float nota1,nota2,nota3,suma;
        System.out.println("Ingresa las 3 notas por favor");
        nota1 = entry.nextFloat();
        nota2= entry.nextFloat();
        nota3 = entry.nextFloat();
        suma=nota1+nota2+nota3;
        System.out.println(" \n La suma de las 3 notas ingresadas son:\t"+suma);
        
        
                
            
    }
    
}
