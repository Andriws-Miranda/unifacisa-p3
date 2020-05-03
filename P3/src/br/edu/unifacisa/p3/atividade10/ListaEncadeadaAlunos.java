package br.edu.unifacisa.p3.atividade10;

public class ListaEncadeadaAlunos {
	private Aluno primeiro;
	private Aluno ultimo;
	private int totalElementos;
	
	public void addComeço(Object elemento) {
		if(this.totalElementos == 0) {
			Aluno novo = new Aluno(elemento);
			this.primeiro = novo;
			this.ultimo = novo;
		}else {
			Aluno novo = new Aluno(this.primeiro, elemento);
			this.primeiro.setAnterior(novo);
			this.primeiro = novo;
		}
		this.totalElementos++;
	}
	public void addFinal(Object elemento) {
		if(this.totalElementos == 0) {
			this.addComeço(elemento);
		}else {
			Aluno novo = new Aluno(elemento);
			this.ultimo.setProximo(novo);
			novo.setAnterior(this.ultimo);
			this.ultimo = novo;
			this.totalElementos++;
		}
	}
	public Aluno get(int index) {
		if(!this.posicaoOcupada(index)) {
			throw new IllegalArgumentException("Posição inexistente");
		}
		
		Aluno atual = primeiro;
		for (int i = 0; i < index;i++) {
			atual.getProximo();
		}
		return atual;
	}
	public Object get(Aluno aluno) {
		Aluno atual = primeiro;
		if (atual.equals(aluno)) {
			return atual;
		}else {
			while (!atual.equals(aluno)) {
				atual.getProximo();
			}
		}
		return atual;
	}
	public Object remove(int index ) {
		if (!this.posicaoOcupada(this.totalElementos-1)) {
			throw new IllegalArgumentException("Posição Inexistente");
		}
		if(this.totalElementos == 1) {
			removeInicio();
		}else if(index == this.totalElementos -1){
			removeFinal();
		}else {
			Aluno anterior = this.get(index-1);
			Aluno atual = anterior.getProximo();
			Aluno proximo = atual.getProximo();
			anterior.setProximo(proximo);
			proximo.setAnterior(anterior);
			this.totalElementos--;
		}
	}
	public int getSize() {
		return this.totalElementos;
	}
	private boolean posicaoOcupada(int posicao) {
		return posicao >=0 && posicao < this.totalElementos;
	}
	private void removeInicio() {
		if(!this.posicaoOcupada(0)) {
			throw new IllegalArgumentException("Posição inexistente");
		}
		this.primeiro = this.primeiro.getProximo();
		this.totalElementos--;
		if(this.totalElementos == 0) {
			this.ultimo = null;
		}
	}
	private void removeFinal() {
		if(!this.posicaoOcupada(this.totalElementos-1)) {
			throw new IllegalArgumentException("Posição inexistente");
		}
		if (this.totalElementos == 1) {
			this.removeInicio();
		}else {
			Aluno penultimo = this.ultimo.getAnterior();
			penultimo.setProximo(null);
			this.ultimo = penultimo;
			this.totalElementos--;
		}
	}
	public String toString() {
		if(totalElementos == 0) {
			return ("[]");
		}
		String toString = "[";
		Aluno atual = primeiro;
		for(int i = 0 ; i < this.totalElementos - 1;i++) {
			toString+=atual.getElemento();
			toString+=",";
			atual = atual.getProximo();
		}
		toString += atual.getElemento();
		toString+="]";
		return  toString;
		
	}
}
