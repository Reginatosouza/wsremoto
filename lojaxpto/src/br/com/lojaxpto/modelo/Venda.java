package br.com.lojaxpto.modelo;

public class Venda {
	
	
	private int notaFiscal;
	private float total;
	private Cliente cliente;
	private Produto produto;
	
	public String getResumo() {
		return 
				"Nota fiscal: " + notaFiscal + "\n" + 
				"Descrição..: " + produto.getDescricao() + "\n" + 
				"Estoque....: " + produto.verificarEstoque() + "\n" + 
				"Fabricante.: " + produto.getFabricante().getRazaoSocial() + "\n" + 
				"Cliente....: " + cliente.getNome();
	}
	
	
	public int getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(int notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Venda(int notaFiscal, float total, Cliente cliente, Produto produto) {
		super();
		this.notaFiscal = notaFiscal;
		this.total = total;
		this.cliente = cliente;
		this.produto = produto;
	}
	public Venda() {
		super();
	}
	@Override
	public String toString() {
		return "Venda [notaFiscal=" + notaFiscal + ", total=" + total + ", cliente=" + cliente + ", produto=" + produto
				+ "]";
	}
}
	
	
	