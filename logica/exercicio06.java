//2 � COMO SEGUNDO TESTE DA SELETIVA DA EMPRESA NVIDIA PARA A VAGA DE PROGRAMADOR J�NIOR,
//VOC� DEVE DESENVOLVER UM PROGRAMA QUE LEIA O VALOR QUE UM CLIENTE POSSUI PARA ADQUIRIR 
//UMA PLACA DE V�DEO DA NVIDIA E BASEADO NA TABELA ABAIXO INDIQUE A PLACA QUE TER� UM MELHOR 
//CUSTO BENEF�CIO AO CLIENTE:

//   INVESTIMENTO                |  PLACA INDICADA
// ABAIXO DE R$ 2000,00          |  RTX 2070
// DE R$ 2000,00 AT� R$ 5000,00  |  RTX 3060
// ACIMA DE R$ 5000,00           |  RTX 3080

package Avaliacao;

import java.util.Scanner;

public class LouisiQuestao02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("informe seu investimento: ");
		double investimento = teclado.nextDouble();
		System.out.print("a placa de v�deo indicada para voc� �: " + placaIndicada(investimento));
		teclado.close();
	}
	
	static String placaIndicada(double investimento){
		String placaIndicada = "";
		if(investimento < 2000) {
			placaIndicada = "RTX 2070";
		}else if(investimento > 2000 && investimento <= 5000) {
			placaIndicada = "RTX 3060";
		}else if(investimento > 5000) {
			placaIndicada = "RTX 3080";
		}
		return placaIndicada;
	}
}
