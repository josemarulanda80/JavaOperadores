/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float numero1,numero2;
        
        System.out.println("Digite 2 numero: ");
        numero1= entrada.nextFloat();
        numero2=entrada.nextFloat();
        float suma= numero1+numero2;
        float resta= numero1+numero2;
        float mult=numero1*numero2;
        float div = numero1/numero2;
        float mod=numero1%numero2;
        
        
        System.out.println("la suma es " + suma);
        System.out.println("la multiplicación es " + mult);
        System.out.println("la resta es " + resta);
        System.out.println("la división es " + div);
        System.out.println("el modulo es " + mod);

        //Operadores con asignación
        int numero=10;
        numero +=5;
        System.out.println("el total de numero es: " + numero);
        // operadores de incremento y decremento
        int x=5,y;
        x++;
        x--;
        y=x++;
        System.out.println(y);
        
        //Usando la clase Math para realizar las operaciones amtermaticas
        
        int raiz= (int)Math.sqrt(9);
        System.out.println("la raiz es " + raiz);
        
        // normalmente usar el double y no convertir, por que asi lo pide el metodo
        double raiz2= Math.sqrt(84839.494);
        System.out.println("el resultado de la segunda raiz es: " + raiz2) ;
        
        
        
        
        
        
        
        
                
        
       
                
                
         
        
    }
    
}
