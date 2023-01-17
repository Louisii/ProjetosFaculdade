//DANDO PROSSEGUIMENTO A SELETIVA DA EMPRESA NVIDIA PARA A VAGA DE PROGRAMADOR JÚNIOR,
//AGORA O TESTE CONSISTE NO DESENVOLVIMENTO DE UM PROGRAMA QUE LEIA UMA MATRIZ DE 
//TAMANHO 3X3. EM SEGUIDA SEJA DESENVOLVIDO UM MÉTODO COM RETORNO (“FUNÇÃO”) QUE RECEBA 
//COMO PARÂMETRO A MATRIZ E SOME OS VALORES DA DIAGONAL PRINCIPAL. O PROGRAMA DEVE 
//APRESENTAR A MATRIZ E A SOMA DA DIAGONAL PRINCIPAL.

package Avaliacao;

import java.util.Scanner;

public class LouisiQuestao03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		
		for(int i=0; i <3; i++) {
			for(int j=0; j <3; j++) {
				System.out.print("matriz[" + i + "]" + "[" + j+ "]: ");
				matriz[i][j] = teclado.nextInt();
			}
		}
		printMatriz(matriz);
		System.out.println("soma da diagonal principal: " + somaDiagonalPrincipal(matriz));
		teclado.close();
	}
	
	static int somaDiagonalPrincipal(int[][] matriz) {
		int soma = 0;
		for(int i=0; i <3; i++) {
			for(int j=0; j <3; j++) {
				if(i == j) {
					soma += matriz[i][j];
				}
			}
		}
		return soma;
	}
	
	static void printMatriz(int[][] matriz) {
		for(int i=0; i <3; i++) {
			for(int j=0; j <3; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.print("\n");
		}
	}

}
