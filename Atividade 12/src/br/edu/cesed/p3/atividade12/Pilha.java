package br.edu.cesed.p3.atividade12;

/**
 * Classe voltada pra simula��o de uma Stack
 * @author Avell
 *
 */

public class Pilha {
	private int inseridos;
	private Conta anterior;
	private Conta primeiro;

	/**
	 * Metodo para inser��o de um novo Objecto (Conta) na pilha, adicionando no topo.
	 * @param Um novo Objeto do tipo "Conta".
	 */
	public void push(Conta novaConta) {
		if(inseridos==0) {
			primeiro = novaConta;
			inseridos++;
		}else {
			setAnterior(this.primeiro);
			primeiro = novaConta;
			inseridos++;
		}
		
	}
	
	public Conta getAnterior() {
		return anterior;
	}

	public void setAnterior(Conta anterior) {
		this.anterior = anterior;
	}

	public int getInseridos() {
		return inseridos;
	}

	public void setInseridos(int inseridos) {
		this.inseridos = inseridos;
	}

	public Conta getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Conta primeiro) {
		this.primeiro = primeiro;
	}

	/**
	 * Metodo para remo��o do primeiro elemento da pilha.
	 */
	public Conta pop() {
		Conta temp = getAnterior();
		setPrimeiro(temp);
		inseridos--;
		return temp;
		}
	
	/**
	 * Metodo para visualiza��o do primeiro elemento na pilha.
	 */
	public Conta peek() {
		return primeiro;
	}
	
	/**
	 * Metodo para compara��o de duas pilhas, retornando um valor booleano para indica��o. 
	 * @param Uma pilha secund�ria para compara��o.
	 * @return Um valor booleano indicando se possui ou n�o igualdade nas pilhas.
	 */
	public boolean isEqualTo(Pilha outraPilha) {
		Conta temp1 = outraPilha.primeiro;
		Conta temp2 = primeiro;
		boolean condicao = true;
		while(condicao) {
			if(!temp1.equals(temp2)) {
				condicao = false;
				return condicao;
			}else {
				temp1 = temp1.proximo;
				temp2 = temp2.proximo;
			}
		}
		return condicao;
	}
	
	
}
