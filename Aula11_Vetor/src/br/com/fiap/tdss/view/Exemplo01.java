package br.com.fiap.tdss.view;

public class Exemplo01 {
	
	public static void main(String[] args) {
		
		//Declarar um vetor de inteiros e instanciar com 5 posicoes
		int[] vetor = new int[5]; //Começa do 0 e vai ate o 4
		
		//Exibir a quantidade de posições do vetor
		System.out.println("O tamanho do vetor: " + vetor.length);
		
		//Exibi o valor da primeira posição do vetor
		System.out.println("Valor da primeira posição: " + vetor[0]);
		
		//Criar um vetor de Strings com 4 pilares da orientação objeto		
		String[] pilares = {"Abstração", "Encapsulamento", "Polimorfismo", "Herança"};
		
		//Laço de repetição par percorrer todos os elementos do vetor
		//for(variável de controle; condição de parada; incremento/decremento)
		System.out.println("Percorrendo o vetor pilares da orientação a objeto");
		for(int i = 0; i<pilares.length; i = i + 1) {
			System.out.println(pilares[i]);		
			
		}
		
		//foreach (variavel que recebe cada um dos itens: vetor
		for(String churros: pilares) {
			System.out.println(churros);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}