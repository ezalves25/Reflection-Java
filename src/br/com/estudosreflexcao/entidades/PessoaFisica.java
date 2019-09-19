package br.com.estudosreflexcao.entidades;

public class PessoaFisica extends Pessoa{
	
	private String endereco;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		String retorno="nome:"+getNome()+"\n"+"cpf:"+getCpf()+"\n"+"rg"+getRg()+"\n"+"endereço:"+getEndereco();
		return retorno;
	}

}
