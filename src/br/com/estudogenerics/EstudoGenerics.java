package br.com.estudogenerics;

import br.com.estudosreflexcao.entidades.Pessoa;

public class EstudoGenerics<E extends Pessoa,T> {
	
	private E e;
	
	private T t;

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}
