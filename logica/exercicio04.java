package Questoes;

import java.util.Scanner;

public class LouisiQuestao04 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		int maisUmCliente = 1;
		int nClientesAtendidos = 0;
		double somaContas = 0;
		double maiorConta = 0;
		double menorConta = 0;
		
		do {
			nClientesAtendidos++;
				
				System.out.print("Total pago pelo cliente " + nClientesAtendidos + " : ");
				double conta = teclado.nextDouble();
				
				if(nClientesAtendidos == 1) {
					maiorConta = conta;
					menorConta = conta;
				}
				
				
			
				somaContas += conta;
				
				if(conta > maiorConta) {
					maiorConta = conta;
				}
				if(conta < menorConta) {
					menorConta = conta;
				}
				
				System.out.print("DESEJA INFORMAR A CONTA DE MAIS UM CLIENTE? 1 – SIM, 2 – NÃO");
				maisUmCliente = teclado.nextInt();
			
			}while(maisUmCliente == 1);
		
			
			System.out.print(	"foram atendidos " + nClientesAtendidos + " clientes.\n" +
							"Media das contas: R$ " + (somaContas / nClientesAtendidos) + "\n" +
							"maior conta: " + maiorConta + ", menor conta: " + menorConta
						);
		
	}

}
