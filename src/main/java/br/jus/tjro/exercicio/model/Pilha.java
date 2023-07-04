package br.jus.tjro.exercicio.model;

public class Pilha {

	private Object[] elementos;
	private int quantidade = 0;
	
	public Pilha(int maximo) {
		elementos = new Object[maximo];
	}

	public boolean estaVazia() {
		return quantidade == 0;
	}

	public Object tamanho() {
		return quantidade;
	}

	public void empilha(Object elemento) {
		this.elementos[quantidade] = elemento;
		quantidade ++;
	}

	public Object topo() {
		if(quantidade >0) {
			return elementos[quantidade-1];
		}else {
			return 0;
		}
	
	}

	public Object desempilha() {	
		Object topo = topo();
		quantidade --;
		return topo;
	}

}
