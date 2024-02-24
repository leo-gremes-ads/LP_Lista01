import javax.swing.JOptionPane;

/*
Receba 2 números reais. Calcule e mostre a diferença desses valores.
*/
public class LT01_EstSeq10
{
	public static void main(String args[])
	{
		double n1, n2, dif;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número"));
		dif = n1 - n2;
		JOptionPane.showMessageDialog(null, "A diferença é " + dif);
	}
}