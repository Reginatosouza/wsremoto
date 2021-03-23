package br.com.gama.modelo;

public class Professor {
	
	
	private String nome;
	private String formacao;
	private String area;
	private Endereco endereco;
	
	public Professor() {	
		super();
	}


	public Professor(String nome, String formacao, String area, Endereco endereco) {
		super();
		this.nome = nome;
		this.formacao = formacao;
		this.area = area;
		this.endereco = endereco;
	}


	public String getResumo() {
		return "Nome: " + nome + "\nFormação: " + formacao + "\nBairro: " + endereco.getBairro();
	}
	
	
	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", formacao=" + formacao + ", area=" + area + ", endereco=" + endereco + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	

}
