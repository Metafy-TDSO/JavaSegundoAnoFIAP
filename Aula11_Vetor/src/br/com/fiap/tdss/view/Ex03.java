package br.com.fiap.tdss.view;

import javax.swing.JOptionPane;

import br.com.fiap.tdss.bean.Aluno;

public class Ex03 {
	
	public static void main(String[] args) {
		
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a numero de alunos: "));
		
		
		Aluno[] vetor = new Aluno[n];
		
		
		for(int i = 0; i<vetor.length; i++) {
			
			String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
			
			float[] grupoNotas = new float[3];
			for(int p = 0; p <3; p++) {
				float nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota: "));
				grupoNotas[p] = nota;
				
			}
			
			vetor[i] = new Aluno(nome, grupoNotas);			
			
			
		}
		
		
		Aluno alunoMaiorNota = vetor[0];
		
		for(int i = 1; i<vetor.length; i++) {
			if(alunoMaiorNota.getMaiorNota() < vetor[i].getMaiorNota()) {
				alunoMaiorNota = vetor[i];
				
			}
			
		}
		
		for(Aluno churros: vetor) {
			System.out.println("Aluno:" + churros.getNome() + "\nNotas: " + churros.getNotas());
			
		}
		
		
		
		
		
		
		
		

		
		
	}

}
