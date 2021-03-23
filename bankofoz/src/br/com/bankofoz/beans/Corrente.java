package br.com.bankofoz.beans;

public class Corrente {
	
	private float limite;
	private float taxa;
	
	public void aumentarLimite(float porc) {
		limite = limite + limite * (porc/100);
	}
	
	public void debitarTaxa() {
	
	}
	
	public boolean sacar(float valor) {
		
			return true;
	}
	
	
	@Override
	public String toString() {
		return "Corrente [limite=" + limite + ", taxa=" + taxa + ", toString()=" + super.toString() + "]";
	}
	public Corrente(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
	  		this.taxa = taxa;
	}
	public Corrente() {
		super();
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public float getTaxa() {
		return taxa;
	}
	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}


}
