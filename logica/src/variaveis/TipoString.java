package variaveis;

public class TipoString {

	public static void main(String[] args) {
		
	String	email = "reginatosouza@gmail.com";
	System.out.println("Original: " + email);
	System.out.println("Minuscula: " + email.toLowerCase());
	System.out.println("Maiuscula: " + email.toUpperCase());
	System.out.println("Qtde Caracteres: " + email.length());
	System.out.println ("? igual: " + email.contentEquals("h@gama.com"));	
	System.out.println ("? igual 2 :" + email.equalsIgnoreCase("h@gama.com"));
	System.out.println("Tem arroba?" + email.contains("@gmail"));
	System.out.println("Do 3 ate o 5:" + email.substring(2,5));	
		
		
		
		
		
		
		
		
	}                                
	
	
	
	
}
