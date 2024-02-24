import javax.swing.JOptionPane;

public class LT01_EstDec18
{
	public static void main(String args[])
	{
		int x, y, dif;

		x = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor"));
		dif = x - y;
		if (dif < 0)
			dif *= -1;
		JOptionPane.showMessageDialog(null, "A diferença é " + dif);
	}
}
