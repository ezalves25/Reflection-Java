package br.com.estudogenerics.main;

import br.com.estudogenerics.EstudoGenerics;
import br.com.estudosreflexcao.entidades.PessoaFisica;

public class EstudoGenericMain  {

	public static  void main(String[] args) {
		PessoaFisica fisica=new PessoaFisica();
		fisica.setNome("Ezequias");
		fisica.setCpf("4545654565");
		fisica.setRg("5445446");
		fisica.setEndereco("rsrsrsrs");
		
		
		EstudoGenerics<PessoaFisica,String> estudoGenerics=new EstudoGenerics<PessoaFisica,String>();
		estudoGenerics.setE(fisica);
		estudoGenerics.setT("Teste T do generics");		
		System.out.println(estudoGenerics.getE()+"\n"+estudoGenerics.getT());
	}
}
