
package com.mycompany.ejercicios_clase_4;

import java.util.Scanner;


public class Ejercicios_Clase_4 {

    public static void main(String[] args) {
        Scanner sp = new Scanner (System.in);
        
        double num1;
        double num2;
        
        System.out.print("Introduce un número: ");
        num1= sp.nextInt();
        
        System.out.print("Introduce otro número: ");
        num2= sp.nextInt();
        
        if(num1==num2)
        {
            System.out.println("Los numeros son iguales");
            
        }
        else
            {
                System.out.println("Los numeros no son iguales");
            }
    }
    
}
        

        
