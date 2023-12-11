package Aula_1206;

import javax.swing.JOptionPane;

public class Switch1 {
	public static void main(String[] args) {
		int numero= 10;
		switch (numero) {
		case (10):
			JOptionPane.showMessageDialog(null,"Menor de idade");
			break;
		case (18):
			JOptionPane.showMessageDialog(null,"Maior de Idade");
			break;
		case (70):
			JOptionPane.showMessageDialog(null,"Experiente");
			break;
		default:
			JOptionPane.showMessageDialog(null,"Nenhuma idade valida");
			break;
		}
	
	}

}

