import javax.swing.JOptionPane;

public class LT01_EstDec22
{
	public static void main(String args[])
	{
		int x, y;

		x = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número"));
		if (y > x)
			JOptionPane.showMessageDialog(null, x + ", " + y);
		else
			JOptionPane.showMessageDialog(null, y + ", " + x);
	}
}