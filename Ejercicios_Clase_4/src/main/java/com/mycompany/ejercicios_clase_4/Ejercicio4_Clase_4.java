
package com.mycompany.ejercicios_clase_4;

import java.util.Scanner;


public class Ejercicio4_Clase_4 {
    
    public static void main (String[]args){
        
        int num1, num2, num3; 
        
        Scanner sp=new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        num1=sp.nextInt();
        System.out.println("Ingrese otro número entero: ");
        num2=sp.nextInt();
        System.out.println("Ingrese otro número entero: ");
        num3=sp.nextInt();
        
        if((num1>num2) && (num2>num3)){
            System.out.println("Mayor a menor: " +num1+","+num2+","+num3);
              
        }
        else if (num1>num3 && num3>num2){
            System.out.println("Mayor a menor: " +num1+","+num3+","+num2);
        }
        
        else if (num2>num1 && num1>num3){
            System.out.println("Mayor a menor: " +num2+","+num1+","+num3);
        
        }
        else if (num2>num3 && num3>num1){
            System.out.println("Mayor a menor: " +num2+","+num3+","+num1);
            
        }
        else if (num3>num1 && num1>num2){
            System.out.println("Mayor a menor: " +num3+","+num1+","+num2);
        }
        else if (num3>num2 && num2>num1){
            System.out.println("Mayor a menor: " +num3+","+num2+","+num1);
        }
    }
    
}