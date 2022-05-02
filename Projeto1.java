package testes;

import java.util.Scanner;

public class Projeto1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double n[] = new double[4];
		
		for(int i = 0 ; i < n.length ; i++){
			System.out.print((i + 1) +"� n�mero decimal: ");
			n[i] = input.nextDouble();
		}
		
		System.out.println("O maior n� do vetor �: " + Maior(n));
		
		System.out.println("O menor n� do vetor �: " + Menor(n));
		
		System.out.println("A m�dia dos n�s �: " + Math.round(Media(n)));
			
	}
	
	public static double Menor(double vetor[]) {
		
		double menor = vetor[0];
		
		for(int i = 0 ; i < vetor.length ; i++) {
			if (menor > vetor[i]) {
				menor = vetor[i];
			}
		}
		
		return menor;
		
	}
	
	public static double Maior(double vetor[]) {
		
		double maior = 0;
		
		for(int i = 0 ; i < vetor.length ; i++) {
			if(maior < vetor[i]) {
				maior = vetor[i];
			}
		}
		
		return maior;
		
	}
	
	public static double Media(double vetor[]) {
		double media = 0;
		
		for(int i = 0 ; i < vetor.length ; i++) {
			media += vetor[i];
		}
		
		return media/vetor.length;
	}
}