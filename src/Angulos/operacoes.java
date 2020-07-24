package Angulos;

import java.util.Locale;
import java.util.Scanner;

import retangulo.Somatória;

public class operacoes {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Somatória rect = new Somatória();
		
		
		System.out.println("digite o valor da altura :");
		
		
	rect.alt = sc.nextDouble();
	
	System.out.println("digite o valor da largura :");
	
	rect.lar = sc.nextDouble();
	
	System.out.print(" o valor da Area é ");
		System.out.println(rect.area());
		System.out.println();
		
		System.out.print (" o valor do perimetro é ");
		
		System.out.println(rect.perimetro());
		
		System.out.println();
		System.out.print(" o valor da diagonal é ");
		
		System.out.println(rect.diagonal());
		
		sc.close();
	}

}
