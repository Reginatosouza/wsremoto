package br.com.robinhomoto.teste;

import javax.swing.JOptionPane;

public class TesteMoto {
	
	public static void main(String[] args) {
		
		
		Moto carro = new Moto();		
		carro.preencherMontadora(JOptionPane.showInputDialog("Montadora"));
		carro.preencherModelo("uno");
		carro.preencherValor((float)15000.00);
		carro.preencherBasico(false, (short)200);
		System.out.println(carro.retornarTudo());
		System.out.println("Desconto: " + carro.retornarDesconto());
		carro.desligar();
		carro.acelerar((short)15);
		carro.acelerar((short)30);
		carro.desacelerar((short)20);
		System.out.println("Depois de acelerar:" + carro.retornarTudo());
		
		
		
		
		
	}
	

	
	
	
}	

}
