/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        float firstNumber,secondNumber,total;
        
        System.out.println("Ingrese los dos números");
        firstNumber=entry.nextFloat();
        secondNumber=entry.nextFloat();
        
        total = (float) Math.pow(firstNumber+secondNumber, 2);
        System.out.println("el resultado del binomio cuadraado es: "+total);
        
        
        
        
    }
    
}
