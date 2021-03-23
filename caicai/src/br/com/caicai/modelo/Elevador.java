package br.com.caicai.modelo;

public class Elevador {
	
	private String nome;
	private byte maximoPessoas;
	private byte andarMaximo;
	private byte andarMinimo;
	private byte andarAtual;
	private byte qtdePessoas;
	//<modificador> <tipo do retorno> <nome do metodo>(<tipo do param> <nome param>){
	
	public void entrar() {
		if (qtdePessoas<maximoPessoas) {
			qtdePessoas+=1;
		}
	}
	
	public void entrar(byte qtdePessoas) {
		if ((this.qtdePessoas+qtdePessoas)<=maximoPessoas) {
			this.qtdePessoas += qtdePessoas;
		}
	}
	
	public String subir() {
		if (andarAtual<andarMaximo) {
			andarAtual+=1;
			return "Subindo para " + andarAtual;
		}
		return "Não foi possível";
	}
	
	public String descer() {
		if (andarAtual>andarMinimo) {
			andarAtual-=1;
			return "Descendo para " + andarAtual;
		}
		return "Não foi possível";
	}
	
	public void sair(byte qtdePessoas) {
		if ((this.qtdePessoas-qtdePessoas)>=0) {
			this.qtdePessoas -= qtdePessoas;
		}
	}
	

	
	
	public void inicializar(String nome, byte pMaxPessoas, byte pAndarMax, byte pAndarMin) {
		this.nome = nome;
		maximoPessoas = pMaxPessoas;
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
	}
	
	@Override
	public String toString() {
		return "Elevador [nome=" + nome + ", maximoPessoas=" + maximoPessoas + ", andarMaximo=" + andarMaximo
				+ ", andarMinimo=" + andarMinimo + ", andarAtual=" + andarAtual + ", qtdePessoas=" + qtdePessoas + "]";
	}
	
	
	
	
	

}
