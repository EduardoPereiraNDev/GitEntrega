package Aula_1206;

import javax.swing.JOptionPane;

public class Relogio {

	public static void main(String[] args) {
		String numero2;
		String numero1;
		String numero3;
		
		int batimentos;
		int batimentosp;
		int oxigenacao;
		
		numero1= JOptionPane.showInputDialog("Ritimo Parado:");
		numero2= JOptionPane.showInputDialog("Ritimo Correndo:");
		numero3= JOptionPane.showInputDialog("Oxigenação:");
		
		batimentosp = Integer.parseInt(numero1);
		batimentos = Integer.parseInt(numero2);
		oxigenacao = Integer.parseInt(numero3); 
		
		if (batimentos > batimentosp*3 || oxigenacao < 95  ) {
			JOptionPane.showMessageDialog(null,"Diminuir");
		}else if (batimentos< batimentosp*2 && oxigenacao > 97 ) {
			JOptionPane.showMessageDialog(null,"Aumentar");
		}else {
			JOptionPane.showMessageDialog(null,"Manter");
		}
	
	}

}
