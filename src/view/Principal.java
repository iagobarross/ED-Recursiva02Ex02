package view;

import controller.ControllerResto;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ControllerResto contRes = new ControllerResto();
		Scanner sc = new Scanner(System.in);
		
		int dividendo = sc.nextInt();
		int divisor = sc.nextInt();
		
		int resto = contRes.calculaResto(dividendo, divisor);
		System.out.println("O resto da divisão de " + dividendo + " pelo "  + divisor + " é: " + resto);
	}

}
