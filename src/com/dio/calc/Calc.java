package com.dio.calc;
import java.util.Scanner; 
public class Calc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextDouble();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextDouble();
		
		double soma = soma (a,b);
		System.out.println("Soma �: " + soma);
		
		double subtracao = subtracao (a,b);
		System.out.println("Subtra��o �: " + subtracao);
		
		double multiplicacao = multiplicacao (a,b);
		System.out.println("Multiplica��o �: " + multiplicacao);
		
		double divisao = divisao (a,b);
		System.out.println("Divis�o �: " + divisao);
	}
	
	//Fun��es
	public static double soma (double a, double b) {
		return a + b;
	}
	public static double subtracao (double a, double b) {
		return a - b;
	}
	public static double multiplicacao (double a, double b) {
		return a * b;
	}
	public static double divisao (double a, double b) {
		return a / b;
	}
	
}
