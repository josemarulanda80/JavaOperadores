/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerccio3;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Ejerccio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        
        float total,dinero;
        
        System.out.println("Ingrese la cantidad de dinero que tiene gillermo");
        dinero = entry.nextFloat();
        
        total = dinero+ (dinero/2);
        total += total/2;
        
        System.out.println("El total de  dinero de los tres amigos es de: " + total);
        
             
        
    }
    
}
