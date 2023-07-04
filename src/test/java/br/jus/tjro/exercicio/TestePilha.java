package br.jus.tjro.exercicio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.jus.tjro.exercicio.model.Pilha;

public class TestePilha {
	
	private Pilha pilha;
	
	@BeforeEach
	public void inicializaPilha() {
		this.pilha = new Pilha(10);
	}
	
	@Test
	public void pilhaVazia() {
		assertTrue(pilha.estaVazia());
		assertEquals(0,pilha.tamanho());
	}
	
	@Test
	public void empilha1Elemento() {
		pilha.empilha("primeiro");
		assertFalse(pilha.estaVazia());
		assertEquals(1,pilha.tamanho());
		assertEquals("primeiro",pilha.topo());
	}
	
	@Test
	public void empilha2Elemento() {
		pilha.empilha("primeiro");
		pilha.empilha("segundo");
		assertFalse(pilha.estaVazia());
		assertEquals(2,pilha.tamanho());
		assertEquals("segundo",pilha.topo());
	}
	
	@Test
	public void empilhaDesempilha() {
		pilha.empilha("primeiro");
		pilha.empilha("segundo");
		assertFalse(pilha.estaVazia());
		assertEquals(2,pilha.tamanho());
		assertEquals("segundo",pilha.topo());
		Object desempilhado = pilha.desempilha();
		assertEquals(1, pilha.tamanho());
		assertEquals("primeiro",pilha.topo());
		assertEquals("segundo", desempilhado);
	}
	
	@Test
	public void removeDaPilhaVazia() {
		pilha.desempilha();
	}

}
