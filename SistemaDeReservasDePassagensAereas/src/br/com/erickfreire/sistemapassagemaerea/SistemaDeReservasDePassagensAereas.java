package br.com.erickfreire.sistemapassagemaerea;

import java.util.Scanner;

/**
 * Programa em Java que simula um sistema de passagem a�rea
 * @author Erick Freire
 * @version 1 - Criado em 09-07-2021 as 16:54
 */

public class SistemaDeReservasDePassagensAereas {
	public static void main(String[] args) {
		
		boolean[] vetor = new boolean[10];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = false;
		}
		
		int tipoDeClasse = 0;
		int assento = 0;
		int resposta = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Sistema de reserva de passagem a�rea: ");
		
		System.out.print("Informe 1 - Primeira Classe ou  2 - Classe econ�mica: ");
		tipoDeClasse = entrada.nextInt();
		
		while(tipoDeClasse < 1 || tipoDeClasse > 2) {
			System.out.print("Op��o Inv�lida: Informe 1 - Primeira Classe ou  2 - Classe econ�mica: ");
			tipoDeClasse = entrada.nextInt();
		}
		
		if(tipoDeClasse == 1) {
		
		   for(int i = 0; i < 5; i++) {
			   if(vetor[i] == false) {
				   vetor[i] = true;
				   assento = i;
				   break;
			   } else {
				   System.out.printf("\nTodos os assentos est�o ocupados, aceita um assento na classe economica? Digite 1 para sim ou 2 para n�o\n");
				   resposta = entrada.nextInt();
				   
				   while(resposta < 1 || resposta > 2) {
						System.out.print("Op��o Inv�lida: Todos os assentos est�o ocupados, aceita um assento na classe economica? Digite 1 para sim ou 2 para n�o\\n ");
						resposta = entrada.nextInt();
					}
				   
				   tipoDeClasse = resposta;
			   }
		   }
		}
		
		if(tipoDeClasse == 2) {
			
			   for(int i = 5; i < 10; i++) {
				   if(vetor[i] == false) {
					   vetor[i] = true;
					   assento = i;
					   break;
				   } else {
					   System.out.printf("\nTodos os assentos est�o ocupados, aceita um assento na Primeira Classe? Digite 1 para sim ou 2 para n�o\n");
					   resposta = entrada.nextInt();
					   
					   while(resposta < 1 || resposta > 2) {
							System.out.print("Op��o Inv�lida: Todos os assentos est�o ocupados, aceita um assento na classe economica? Digite 1 para sim ou 2 para n�o\\n ");
							resposta = entrada.nextInt();
						}
					   tipoDeClasse = resposta;
				   }
			   }
			}
		
		System.out.printf("\n\nAssento Reservado: Poltrona %d \nO V�o Sa�ra em 3 Horas: ", assento);
			
		
	}

}
