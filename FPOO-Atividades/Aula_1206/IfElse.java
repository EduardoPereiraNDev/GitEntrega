package Aula_1206;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		String numero2;
		
		int numero;
		
		numero2= JOptionPane.showInputDialog("Entre com sua idade:");
		numero = Integer.parseInt(numero2);
		
		if (numero >= 18) {
			JOptionPane.showMessageDialog(null,"Voce tem que votar");
		}else if (numero >= 16 && numero < 18) {
			JOptionPane.showMessageDialog(null,"Voce pode votar");
		}else {
			JOptionPane.showMessageDialog(null,"Voce nao pode votar");
		}
	
	}

}
