package Questoes;

import java.util.Scanner;

public class LouisiQuestao03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
			

		double maiorConta = 0;
		double menorConta = 0;
			
		for(int i = 1; i <= 10; i++) {
			System.out.print("Total pago pelo cliente " + i + " : ");
			double conta = teclado.nextDouble();
				 
			if(i == 1) {
				maiorConta = conta;
				menorConta = conta;
			}
				
			if(conta > maiorConta) {
				maiorConta = conta;
			}
				
				
			if(conta < menorConta) {
				menorConta = conta;
			}
		}
			
		System.out.print("maior conta: " + maiorConta + ", menor conta: " + menorConta);
		
	}

}
