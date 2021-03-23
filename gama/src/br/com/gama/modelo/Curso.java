package br.com.gama.modelo;

public class Curso {
	
	private String sigla;
	private String descricao;
	private boolean ativo;
	private float valor;
	private byte duracao;
	
	public Curso() {
		super();
	}

	public Curso(String sigla, String descricao, boolean ativo, float valor, byte duracao) {
		super();
		this.sigla = sigla;
		this.descricao = descricao;
		this.ativo = ativo;
		this.valor = valor;
		this.duracao = duracao;
	}

	public void atualizarValor(float porcentagem) {
		valor = valor + valor * (porcentagem/100);
	}
	
	@Override
	public String toString() {
		return "Curso [sigla=" + sigla + ", descricao=" + descricao + ", ativo=" + ativo + ", valor=" + valor
				+ ", duracao=" + duracao + "]";
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public byte getDuracao() {
		return duracao;
	}
	public void setDuracao(byte duracao) {
		this.duracao = duracao;
	}

	
	

}
