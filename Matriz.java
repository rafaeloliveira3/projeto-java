package matrizes;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double mat[][] = new double[2][2];
		
		for(int linha = 0 ; linha < mat.length; linha++) {
			for (int coluna = 0 ; coluna < mat[0].length ; coluna ++) {
				System.out.print("Digite um n°: ");
				mat[linha][coluna] = input.nextDouble();
				
			}
		}
		
		for(int linha = 0 ; linha < mat.length; linha++) {
			for (int coluna = 0 ; coluna < mat[0].length ; coluna ++) {
				System.out.println(mat[linha][coluna]);
				
			}
		}
		
		System.out.println("O menor n° da Matriz é: " + Menor(mat));
		System.out.println("A média dos n°s é: " + Media(mat));
		
		input.close();
		
	}
	
	public static double Menor(double matriz[][]) {
		
		double menor = matriz[0][0];
		
		for(int linha = 0 ; linha < matriz.length ; linha++) {
			for (int coluna = 0 ; coluna < matriz[0].length ; coluna ++) {
				if (menor > matriz[linha][coluna]) {
					menor = matriz[linha][coluna];
				}
			}
		}
		
		return menor;
		
	}
	
	public static double Media(double matriz[][]) {
		double media = 0;
		
		for(int linha = 0 ; linha < matriz.length ; linha++) {
			for (int coluna = 0 ; coluna < matriz[0].length ; coluna ++) {
				media += matriz[linha][coluna];
			}
		}
		
		return media / (matriz.length + matriz[0].length);
	}
}
