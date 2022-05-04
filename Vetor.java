package testes;

import java.util.Scanner;

public class Vetor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double n[] = new double[4];
		
		for(int i = 0 ; i < n.length ; i++){
			System.out.print((i + 1) +"� n�mero decimal: ");
			n[i] = input.nextDouble();
		}
		
		System.out.println("O maior n� do vetor �: " + maior(n));
		
		System.out.println("O menor n� do vetor �: " + menor(n));
		
		System.out.println("A m�dia dos n�s �: " + Math.round(media(n)));
		
	}
	
//	M�todo referente a encontrar o menor n�mero do vetor
	public static double menor(double vetor[]) {
		
		double menor = vetor[0];
		
		for(int i = 0 ; i < vetor.length ; i++) {
			if (menor > vetor[i]) {
				menor = vetor[i];
			}
		}
		
		return menor;
		
	}
	
//	M�todo referente a encontrar o maior n�mero do vetor
	public static double maior(double vetor[]) {
		
		double maior = 0;
		
		for(int i = 0 ; i < vetor.length ; i++) {
			if(maior < vetor[i]) {
				maior = vetor[i];
			}
		}
		
		return maior;
		
	}
	
//	M�todo referente a calcular a m�dia aritm�tica dos n�meros do vetor
	public static double media(double vetor[]) {
		double media = 0;
		
		for(int i = 0 ; i < vetor.length ; i++) {
			media += vetor[i];
		}
		
		return media/vetor.length;
	}
}