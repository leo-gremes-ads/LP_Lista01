import javax.swing.JOptionPane;

public class LT01_EstDec23
{
	public static void main(String args[])
	{
		double n1, n2, n3, n4;

		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe outro valor\nMaior que o primeiro"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe outro valor\nMaior que o segundo"));
		n4 = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor qualquer"));
		if (n4 < n1)
			JOptionPane.showMessageDialog(null, n4 + " -> " + n1 + " -> " + n2 + " -> " + n3);
		else if (n4 < n2)
			JOptionPane.showMessageDialog(null, n1 + " -> " + n4 + " -> " + n2 + " -> " + n3);
		else if (n4 < n3)
			JOptionPane.showMessageDialog(null, n1 + " -> " + n2 + " -> " + n4 + " -> " + n3);
		else
			JOptionPane.showMessageDialog(null, n1 + " -> " + n2 + " -> " + n3 + " -> " + n4);
	}
}