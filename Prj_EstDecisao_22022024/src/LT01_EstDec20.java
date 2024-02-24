import javax.swing.JOptionPane;

public class LT01_EstDec20
{
	public static void main(String args[])
	{
		int a, b, c;
		double delta, x1, x2;

		a = Integer.parseInt(JOptionPane.showInputDialog("Insira o A"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Insira o B"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Insira o C"));
		delta = (b * b) - (4 * a * c);
		if (delta < 0)
			JOptionPane.showMessageDialog(null, "Não há raízes reais");
		else if (delta == 0) {
			x1 = (0 - b) / (double)(2 * a);
			JOptionPane.showMessageDialog(null, "Há uma raíz real: " + x1);
		}
		else {
			delta = Math.sqrt(delta);
			x1 = ((0 - b) + delta) / (double)(2 * a);
			x2 = ((0 - b) - delta) / (double)(2 * a);
			JOptionPane.showMessageDialog(null, "Há duas raizes reais: " + x1 + " e " + x2);
		}
	}
}