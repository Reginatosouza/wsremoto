package variaveis;

public class TiposDados {
	//Start Point da aplicação 
	public static void main(String[] args) {
		
		
		String nome = "reginato souza";
		int idade = 45;
		double altura = 1.71;
		double peso = 98.0;
		double imc = peso / (altura * altura);
		
		System.out.println("nome..:" + nome);
		System.out.println("idade.:" + idade);
		System.out.println("altura:" + altura);
		System.out.printf("\nIMC...:%.2f\n" , imc);
		System.out.printf("Olá %s seu IMC eh %.2f" , nome, imc);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
