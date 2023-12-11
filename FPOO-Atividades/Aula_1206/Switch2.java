package Aula_1206;

import javax.swing.JOptionPane;

public class Switch2 {
	public enum dias {dom, seg, ter}
	
	public static void main (String [] args) {
		dias [] diasHoje = dias.values();
		for(dias agora : diasHoje) {//foreach usado para listas!
			switch (agora) {
			case dom:
				JOptionPane.showMessageDialog(null,"Domingo");
				break;
			case seg:
				JOptionPane.showMessageDialog(null,"Segunda");
				break;
			case ter:
				JOptionPane.showMessageDialog(null,"Terca");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Dias nao validos");
				break;
			}
		}
	}
}
