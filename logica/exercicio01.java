package Questoes;

import java.util.Scanner;

public class LouisiQuestao01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Valor do prato de entrada: ");
		double pratoEntrada = teclado.nextDouble();
		
		System.out.print("Valor do prato principal: ");
		double pratoPrincipal = teclado.nextDouble();
		
		System.out.print("Valor da sobremesa: ");
		double sobremesa = teclado.nextDouble();
		
		System.out.print("Valor da bebida: ");
		double bebida = teclado.nextDouble();
		
		double soma = pratoEntrada + pratoPrincipal + sobremesa + bebida;
		double taxaGarcom = 0.10;
		
		double totalAPagar = soma + (soma * taxaGarcom);
		
		System.out.print("O cliente deve pagar R$ " + totalAPagar);

	}

}
