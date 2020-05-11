package br.edu.cesed.p3.atividade12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PilhaTest {
	private	Pilha pilha = new Pilha();
	
	@Test
	public void adicionarUm() {
		Conta novaConta = new Conta(25, 50, "Andriws");
		pilha.push(novaConta);
		Assertions.assertEquals(1, pilha.getInseridos());
	}
	
	@Test
	public void adicionarMaisDeUm() {
		Conta novaConta1 = new Conta(25,50,"Andriws");
		Conta novaConta2 = new Conta(25,22,"Jefferson");
		pilha.push(novaConta1);
		pilha.push(novaConta2);
		Assertions.assertEquals(2, pilha.getInseridos());
	}
	
	@Test
	public void testPeek() {
		Conta novaConta1 = new Conta(25,50,"Andriws");
		Conta novaConta2 = new Conta(25,22,"Jefferson");
		pilha.push(novaConta1);
		pilha.push(novaConta2);
		
		Assertions.assertEquals(novaConta2, pilha.getPrimeiro());
	}
	
	@Test
	public void testGetProximo() {
		Conta novaConta1 = new Conta(25,50,"Andriws");
		Conta novaConta2 = new Conta(25,22,"Jefferson");
		pilha.push(novaConta1);
		pilha.push(novaConta2);
		pilha.pop();
		
		Assertions.assertEquals(novaConta1, pilha.getPrimeiro());
	}
	
	@Test
	public void testIsEqualsTo() {
		Conta novaConta1 = new Conta(25,50,"Andriws");
		Conta novaConta2 = new Conta(25,22,"Jefferson");
		Pilha pilha = new Pilha();
		pilha.push(novaConta1);
		pilha.push(novaConta2);
		
		Conta novaConta0 = new Conta(25,50,"Andriws");
		Conta novaConta01 = new Conta(25,22,"Jefferson");
		Pilha pilha2 = new Pilha();
		pilha2.push(novaConta0);
		pilha2.push(novaConta01);
		
		Assertions.assertEquals(false, pilha.isEqualTo(pilha2));
	}

}
