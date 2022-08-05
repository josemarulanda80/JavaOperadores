/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        
        final int salario =1000;
        int nAutos;
        float totalV,totalSalario;
        
        System.out.println("Ingrese el numero de autos vendidos:");
        nAutos = entry.nextInt();
        
        System.out.println("Ingrese la cantidad de los autos vendidos:");
        totalV=entry.nextFloat();
        
        totalSalario= (float) (salario+(nAutos*150)+(totalV*1.05));
        
        System.out.println("El salario del vendedor es: "+totalSalario);
        
            
    }
    
}
