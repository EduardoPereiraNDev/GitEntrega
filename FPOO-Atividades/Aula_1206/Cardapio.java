package Aula_1206;

import javax.swing.JOptionPane;

import Aula_1206.Switch2.dias;

public class Cardapio {
public enum dias {lanche, bebida, sobremesa}
	
public static void main(String[] args) {
	int numero;
	String numero2;
	numero2= JOptionPane.showInputDialog("Entre com o numero:");
	numero = Integer.parseInt(numero2);
	
	switch (numero) {
		case (1):
			JOptionPane.showMessageDialog(null,"Voce pediu lanche");
			break;
		case (2):
			JOptionPane.showMessageDialog(null,"Voce pediu refrigerante");
			break;
		case (3):
			JOptionPane.showMessageDialog(null,"Voce pediu sobremesa");
			break;
		default:
			JOptionPane.showMessageDialog(null,"Nenhum pedido valido");
			break;
		}

	}
}
