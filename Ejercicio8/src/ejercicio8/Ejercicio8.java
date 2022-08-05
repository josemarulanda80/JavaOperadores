/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        
        float a,b,c,total1,total2;
        System.out.println("Ingrese los coeficientes");
        a= entry.nextFloat();
        b=entry.nextFloat();
        c=entry.nextFloat();
        total1= (float) ((-b+Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a);
        total2= (float) ((-b-Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a);
        
        System.out.println("el primer vaolr de x es: "+total1+"\nEl segundo valor de x es: "+total2);
        
        
        
    }
    
}
