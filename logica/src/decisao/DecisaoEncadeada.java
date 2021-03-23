package decisao;

public class DecisaoEncadeada {
	
	
	public static void main(String[] args) {
		
		String disciplina = JOptionPane.showInputDialog("Disciplina: ").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1:"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2:"));
		float media = (nota1+nota2)/2;
		System.out.println("Média: " + media);
		if (media>=6) {
		System.out.println("Parabéns: " + disciplina);
		
		
		
		
	}

}
