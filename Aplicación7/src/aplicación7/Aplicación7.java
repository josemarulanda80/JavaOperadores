/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicación7;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Aplicación7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        
        float numberH;
        int semanas,modSemanas,modHoras;
        System.out.println("Ingrese el numero de horas :");
        numberH=entry.nextFloat();
        semanas = (int) (numberH/(24*7));
        modSemanas=(int) (numberH%(24*7))/24;
        modHoras = (int) (numberH%(24*7))%24;
        
        System.out.println("El número de semanas es de "+ semanas+"\nEl numero de dias es de: " + modSemanas +"\nEl numero de horas es de: "+modHoras);
        
        
                
        
        
        
        
    }
    
}
