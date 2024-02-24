import javax.swing.JOptionPane;

/*
Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados
*/

public class LT01_EstSeq09
{
	public static void main(String args[])
	{
		int x, y, soma;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor:"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor:"));
		x = x * x;
		y = y * y;
		soma = x + y;
		JOptionPane.showMessageDialog(null, "A soma dos quadrados é " + soma);
	}
}