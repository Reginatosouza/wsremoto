package variaveis;

import javax.swing.JOptionPane;

public class TesteTipos {
	
	
	public static void main(String[] args) {
		
		/*
		 * Dados a serem capturados:
		 * - Nome do Produto (notebook's)
		 * - Qtde
		 * - Imposto (10%, 5% ....)
		 * - Valor nitatio
		 * No final dever? exibir:
		 * - o valor acrescido com o imposto
		 * - 0 valor do imposto isoladp
		 * - o total com imposto
		 * - o total sem imposto
		 
		 */

			
			String notebook = JOptionPane.showInputDialog("digite o notebook");
		    String quantidade = JOptionPane.showInputDialog("digite o quantidade");
		    double pre?o = Double.parseDouble(JOptionPane.showInputDialog("digite a pre?o"));
			int imposto = Integer.parseInt(JOptionPane.showInputDialog("Digite o imposto."));
			double total = pre?o / imposto + pre?o;
			
			System.out.printf
			("Modelo do notebook %s x %s pre?o com imposto: R$ %.2f", notebook, quantidade, total);
			
		
		
	}

}
