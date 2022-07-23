
package com.mycompany.ejercicios_clase_4;

import java.util.Scanner;



public class Ejercicio5_Clase_4 {
    
	public static void main(String[] args) {
 
		Scanner sp= new Scanner(System.in);
		System.out.print("Ingresar día(DD): ");
		int dia = sp.nextInt();
		if (validarDia(dia)) {
			
		}
 
		sp.close();
		System.out.println("\nFIN DE PROGRAMA");
	}
 
	private static boolean validarDia(int dia) {
		if (dia == 0) {
			System.out.println("Dia 0 incorrecto");
			return false;
		}
		else if (dia > 31) {
			System.out.println("Dia >31 incorrecto");
			return false;
		}
		else if (dia < 0) {
			System.out.println("Dia <0 incorrecto");
			return false;
		}
		else
			return true; //Día correcto
	}
 
}