package br.com.estudosreflexcao.entidades;

public class Pessoa {

	private String nome;
	private String cpf;
	private String rg;
	
	@Coluna(posicao=1)
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Coluna(posicao=2)
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}	
	
	
}
