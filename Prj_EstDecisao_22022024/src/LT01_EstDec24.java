import javax.swing.JOptionPane;

public class LT01_EstDec24
{
	public static void main(String args[])
	{
		int x;
		boolean d2, d3;

		x = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro"));
		d2 = x % 2 == 0;
		d3 = x % 3 == 0;
		if (d2 && d3)
			JOptionPane.showMessageDialog(null, "É divisível por 2 e por 3");
		else if (d2)
			JOptionPane.showMessageDialog(null, "É divisível apenas por 2");
		else if (d3)
			JOptionPane.showMessageDialog(null, "É divisível apenas por 3");
		else
			JOptionPane.showMessageDialog(null, "Não é divisível por 2 nem por 3");
	}
}