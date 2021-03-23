package decisao;

import javax.swing.JOptionPane;

public class Teste01 {
	
	short diarias = Short.parseShort(JOptionPane.showInputDialog("Diarias"));
	if (diarias>15) {
		System.out.println("Total: " + ((80+5.5)*diarias));
	}else if(diarias==15) {
		System.out.println("Total: " + ((80+6)*diarias));
	}else {
		System.out.println("Total: " + ((80+8)*diarias));
	}
	*/
	// boolean => char => byte => short => int => long => float => double
	short diarias = Short.parseShort(JOptionPane.showInputDialog("Diarias"));
	float taxa = 8;
	if (diarias>15) {
		taxa = (float) 5.5; // aqui está ocorrendo um CAST
	}else if (diarias==15) {
		taxa=6;
	}
	System.out.println("Total: " + ((85+taxa)*diarias));

}

