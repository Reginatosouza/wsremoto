package br.com.bankofoz.beans;

public class Poupanca {
	
	private float rendimento;


	
	@Override
	public String toString() {
		return "Poupanca [rendimento=" + rendimento + ", " + super.toString() + "]";
	}

	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		
		this.rendimento = rendimento;
	}

	public Poupanca() {
		super();
	}

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}
	
}