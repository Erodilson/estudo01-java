package Angulos;

import java.util.Locale;
import java.util.Scanner;

import retangulo.Somat�ria;

public class operacoes {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Somat�ria rect = new Somat�ria();
		
		
		System.out.println("digite o valor da altura :");
		
		
	rect.alt = sc.nextDouble();
	
	System.out.println("digite o valor da largura :");
	
	rect.lar = sc.nextDouble();
	
	System.out.print(" o valor da Area � ");
		System.out.println(rect.area());
		System.out.println();
		
		System.out.print (" o valor do perimetro � ");
		
		System.out.println(rect.perimetro());
		
		System.out.println();
		System.out.print(" o valor da diagonal � ");
		
		System.out.println(rect.diagonal());
		
		sc.close();
	}

}
