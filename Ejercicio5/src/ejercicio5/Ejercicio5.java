/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        
        float nota1, nota2,nota3,nota4,total;
        
        System.out.println("Ingrese las cinco notas del estudiante");
        nota1= (float) (entry.nextFloat()*0.1);
        nota2= (float) (entry.nextFloat()*0.25);
        nota3= (float) (entry.nextFloat()*0.25);
        nota4= (float) (entry.nextFloat()*0.4);
        
        total=nota1+nota2+nota3+nota4;
        
        System.out.println("La nota total es de: "+total);
        
        
        
        
        
        
        
        
        
        
    }
    
}
