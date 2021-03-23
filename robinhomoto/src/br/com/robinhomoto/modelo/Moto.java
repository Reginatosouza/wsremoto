package br.com.robinhomoto.modelo;

public class Moto {
	
	private String montadora;
	private float valor;
	private short velocidadeAtual;
	private boolean status=true;
	private short velocidadeMaxima;
	private String modelo;
	
	// sintaxe dos métodos
	// <modificador> <tipo do retorno> <nome do metodo>(<tipo param> <nome param>,...){
	
	public void desacelerar(short velocidade) {
		if (status==true && (velocidadeAtual-velocidade)>=0) {
			velocidadeAtual-=velocidade;
		}
	}
	
	public void acelerar(short velocidade) {
		if (status==true && (velocidadeAtual+velocidade)<=velocidadeMaxima) {
			velocidadeAtual+=velocidade;
		}
	}
	
	public String desligar() {
		status=false;
		velocidadeAtual=0;
		return "Desligado";
	}
	
	public String ligar() {
		status=true;
		return "Ligado";
	}
	
	
	public float retornarDesconto() {
		return valor * (float) 0.9;
	}
	
	public String retornarTudo() {
		return 
				"Montadora..........: " + montadora + "\n" +
				"Valor..............: " + valor + "\n" + 
				"Velocidade Atual...: " + velocidadeAtual + "\n" + 
				"Status.............: " + status + "\n" + 
				"Velocidade Máxima..: " + velocidadeMaxima + "\n" + 
				"Modelo.............: " + modelo; 
	}
	
	public void preencherBasico(boolean pStatus, short pVelocidadeMaxima) {
		status = pStatus;
		velocidadeMaxima = pVelocidadeMaxima;
	}
	
	public float retornarValor() {
		return valor;
	}
	
	public void preencherValor(float param) {
		if (param>0) {
			valor = param;
		}
	}
	
	
	public String retornarModelo() {
		return modelo;
	}
	
	public void preencherModelo(String param) {
		modelo=param.toUpperCase();
	}
	
	public String retornarMontadora() {
		return montadora;
	}
		
	
	public void preencherMontadora(String param) {
		montadora = param.toUpperCase();
	}
	
}
	
	
	
	
	


