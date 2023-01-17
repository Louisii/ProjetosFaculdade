package Questoes;

import java.util.Scanner;

public class LouisiQuestao02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Quantidade de garrafas de vinho: ");
		int qntVinho = teclado.nextInt();
		
		System.out.print("Quantidade de garrafas de refrigerante: ");
		int qntRefri = teclado.nextInt();
		
		System.out.print("Quantidade de garrafas de água: ");
		int qntAgua = teclado.nextInt();
		
		double compraVinho = qntVinho * 50.0;
		double compraRefri = qntRefri * 7.0;
		double compraAgua = qntAgua * 3.0;
		
		//desconto vinho
		if(compraVinho < 20000) {
			compraVinho = compraVinho - (compraVinho * 0.05);
		} 
		else {
			compraVinho = compraVinho - (compraVinho * 0.10);
		}
		
		//desconto refri
		if(compraRefri < 10000) {
			compraRefri = compraRefri - (compraRefri * 0.04);
		} 
		else {
			compraRefri = compraRefri - (compraRefri * 0.06);
		}
		
		//desconto agua
		compraAgua = compraAgua - (compraAgua * 0.03);
		
		double total = compraVinho + compraRefri+ compraAgua;
		
		System.out.print("Valor a pagar: R$ " + total);

	}

}
