package Aula_1206;

import javax.swing.JOptionPane;

public class Paridade {
	public static void main(String[] args) {
		String numero2;
		
		int numero;
		
		numero2= JOptionPane.showInputDialog("Coloque um numero");
		numero = Integer.parseInt(numero2);
		if (numero > 0) {
			JOptionPane.showMessageDialog(null,"Positivo");
		}else if (numero < 0)  {
			JOptionPane.showMessageDialog(null,"Negativo");
		}else {
			JOptionPane.showMessageDialog(null,"E o zero"
					+ "+");
		}
	
	}
}
/* mod % (resto da divisão por 2)
  and &&
  Or ||
  not ~
 */

