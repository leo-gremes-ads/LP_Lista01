import javax.swing.JOptionPane;

/*
Receba os coeficientes A, B e C de uma equação do 2º grau
(AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a
equação possue2 raízes).
*/

public class LT01_EstSeq05
{
	public static void main(String args[])
	{
		int a, b, c;
		double d, x1, x2;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe o A:"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe o B:"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Informe o C:"));        
		d = (b * b) - (4 * a * c);
		d = Math.sqrt(d);
		x1 = ((0 - b) + d) / (2 * a);
		x2 = ((0 - b) - d) / (2 * a);
		JOptionPane.showMessageDialog(null, "X1 -> " + x1 + "\nX2 -> " + x2);
	}
}