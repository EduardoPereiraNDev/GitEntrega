package Aula_1206;
 
import javax.swing.JOptionPane;

public class Multiplica { //Nome da classe é Soma
	public static void main(String []args) {
		String primeiroNumero;
		String segundoNumero;
		
		float numero1;
		float numero2;
		float multiplica;
		
		primeiroNumero= JOptionPane.showInputDialog("Entre com o 1° numero:");
		segundoNumero= JOptionPane.showInputDialog("Entre com o 2° numero:");
		//conversão de tipos (parse)
		numero1 = Float.parseFloat(primeiroNumero);
		numero2 = Float.parseFloat(segundoNumero);
		multiplica = numero1 * numero2;
		
		JOptionPane.showMessageDialog(null, "A multiplicação é" + multiplica,"Resualtado da multiplicação:"
				, JOptionPane.PLAIN_MESSAGE);
		System.out.println("A multiplicacao e " + multiplica);
	}
}
