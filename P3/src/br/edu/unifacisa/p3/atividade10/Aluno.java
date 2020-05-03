package br.edu.unifacisa.p3.atividade10;

import lombok.*;

@Data
public class Aluno {
	private Aluno proximo;
	private Aluno anterior;
	private Object elemento;
	
	public Aluno(Aluno proximo, Object elemento) {
		this.proximo = proximo;
		this.elemento=elemento;
	}
	public Aluno(Object elemento) {
		this.elemento = elemento;
	}
	
}
