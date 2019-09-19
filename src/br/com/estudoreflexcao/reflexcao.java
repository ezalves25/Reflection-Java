package br.com.estudoreflexcao;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.*;

import br.com.estudosreflexcao.entidades.Coluna;
import br.com.estudosreflexcao.entidades.Pessoa;

public class reflexcao {
	
	public static void main(String[] args) {
		Pessoa pessoa=new Pessoa();
		
		pessoa.setNome("Ezequias");
		pessoa.setCpf("00887959180");
		pessoa.setRg("3738714");
			
		
		
		listaAtributos(new Pessoa().getClass());
		
		listaMetodos(Pessoa.class);
		
	
		
		
		
		
	}

	private static <T> void listaMetodos(Class<T> classe) {
		for (Method metodos: classe.getDeclaredMethods()) {
			if (metodos.isAnnotationPresent(Coluna.class)) {
				System.out.println("Método:"+metodos.getName());				
			}
			
		}
	}
	
	public static <T> void listaAtributos(Class<T> classe) {
//		Class<T> classeInterna=(Class<T>) classe.getClass();
		for (Field atributo:classe.getDeclaredFields()) {
			System.out.println("Atributos:"+atributo.getName());
		}
	}
	
	
		
	
}
