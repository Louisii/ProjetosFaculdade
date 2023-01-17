//1 – A NVIDIA ESTÁ PRECISANDO AUMENTAR SUA EQUIPE DE DESENVOLVEDORES DE DRIVERS E VOCÊ 
//ESTÁ PARTICIPANDO DA SELETIVA PARA VAGA DE PROGRAMADOR JÚNIOR.
//COMO PRIMEIRO TESTE DA SELETIVA, VOCÊ DEVE DESENVOLVER UM PROGRAMA QUE LEIA AS 10 NOTAS 
//OBTIDAS NO TESTE DE PERFORMANCE DO PROCESSADOR DA PLACA RTX 3090 E AS ARMAZENE EM UM 
//ARRAY. O PROGRAMA DEVE CALCULAR E APRESENTAR A MÉDIA DAS NOTAS E CONTABILIZAR QUANTAS 
//NOTAS FICARAM ACIMA DA MÉDIA.

package Avaliacao;

import java.util.Scanner;

public class LouisiQuestao01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] notas = new double[10];
		for(int i=0; i<10; i++) {
			System.out.print(i + ". nota do teste de performance:");
			notas[i] = teclado.nextDouble();
		}
		System.out.print("\n media: " + calcularMedia(notas));
		System.out.print("\n número de notas acima da media: " + contabilizarAcimaDaMedia(notas));
		teclado.close();
	}
	
	//funções
	static double calcularMedia(double[] numeros) {
		double soma = 0;
		for(int i=0; i<numeros.length; i++) {
			soma += numeros[i];
		}
		return (soma/numeros.length);
	}
	
	static int contabilizarAcimaDaMedia(double[] numeros) {
		double media = calcularMedia(numeros);
		int notasAcimaDaMedia = 0; 
		for(int i=0; i<numeros.length; i++) {
			if(numeros[i] > media) {
				notasAcimaDaMedia++;
			}
		}
		return notasAcimaDaMedia;
		
	}

}
