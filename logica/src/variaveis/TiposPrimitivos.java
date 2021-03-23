package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {
	
	
	public static void main(String[] args) {
		
		String time1 = JOptionPane.showInputDialog("digite o time1");
	    String time2 = JOptionPane.showInputDialog("digite o time2");
	    double entrada = Double.parseDouble(JOptionPane.showInputDialog("digite a entrada"));
		int publico = Integer.parseInt(JOptionPane.showInputDialog("Digite o público."));
		double total = entrada * publico;
		
		System.out.printf
		("No jogo entre %s x %s a arrecadação foi de: R$ %.2f", time1, time2, total);
		
		
		
		
	}

}
