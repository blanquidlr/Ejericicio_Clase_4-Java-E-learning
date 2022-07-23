
package com.mycompany.ejercicios_clase_4;

import java.util.Scanner;


public class Ejercicio3_Clase_4 {
    
    public static void main (String[]args){
        
        int num1, num2; 
        
        Scanner sp=new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        num1=sp.nextInt();
        System.out.println("Ingrese otro número entero: ");
        num2=sp.nextInt();
        
        if(num1>num2){
            System.out.println(num1+" y "+num2);
            
          
        }
        else{
            System.out.println(num2+" y"+num1);
        }
        
    }
    
}
