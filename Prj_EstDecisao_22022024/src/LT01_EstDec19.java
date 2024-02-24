import javax.swing.JOptionPane;

public class LT01_EstDec19
{
	public static void main(String args[])
	{
		double x, y;

		x = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor"));
		y = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor"));
		if (x > y)
			JOptionPane.showMessageDialog(null, "O maior valor é " + x);
		else
			JOptionPane.showMessageDialog(null, "O maior valor é " + y);
	}
}
