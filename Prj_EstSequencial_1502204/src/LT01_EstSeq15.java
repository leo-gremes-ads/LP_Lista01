import javax.swing.JOptionPane;

public class LT01_EstSeq15
{
	public static void main(String args[])
	{
		double c1, c2, h;
		
		c1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do 1º cateto"));
		c2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do 2º cateto"));
		c1 = c1 * c1;
		c2 = c2 * c2;
		h = c1 + c2;
		h = Math.sqrt(h);
		JOptionPane.showMessageDialog(null, "A hipotenusa tem " + h);
	}
}