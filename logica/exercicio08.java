//COMO ÚLTIMO TESTE DA SELETIVA DA EMPRESA NVIDIA PARA A VAGA DE PROGRAMADOR JÚNIOR,
//VOCÊ DEVE DESENVOLVER UM PROGRAMA ONDE O USUÁRIO DEFINA A QUANTIDADE DE NÚMEROS A
//SEREM LIDOS. EM SEGUIDA LEIA OS NÚMEROS E ARMAZENE-OS EM UM ARRAY. DEPOIS DESENVOLVA 
//MÉTODOS (“PROCEDIMENTOS” OU “FUNÇÕES”) PARA IDENTIFICAR E APRESENTAR AS SEGUINTES 
//  INFORMAÇÕES:
//  - O MAIOR ELEMENTO DO ARRAY;
//  - O MENOR ELEMENTO DO ARRAY;
//  - A MÉDIA DOS ELEMENTOS DO ARRAY

package Avaliacao;

import java.util.Scanner;

public class LouisiQuestao04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Quantos elementos serão informados? ");
		int tamanhoArray = teclado.nextInt();
		int[] arr = new int[tamanhoArray];
		
		for(int i=0; i<tamanhoArray; i++) {
			System.out.print(i + ". elemento:");
			arr[i] = teclado.nextInt();
		} 
		
		System.out.println("Maior elemento do array: " + maiorElemntoArray(arr));
		System.out.println("Menor elemento do array: " + menorElemntoArray(arr));
		System.out.println("Media dos elementos do array: " + mediaElemntosArray(arr));
		teclado.close();
	}
	
	//metodos
	static int maiorElemntoArray(int[] arr) {
		int maiorElemento = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > maiorElemento) {
				maiorElemento = arr[i];
			}
		}
		return maiorElemento;
	}
	
	static int menorElemntoArray(int[] arr) {
		int menorElemento = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < menorElemento) {
				menorElemento = arr[i];
			}
		}
		return menorElemento;
	}

	static double mediaElemntosArray(int[] arr) {
		int soma = 0;
		for(int i=0; i<arr.length; i++) {
			soma += arr[i];
		}
		double media = soma/arr.length;
		return media;
	}

}
