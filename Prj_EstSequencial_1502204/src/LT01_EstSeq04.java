import javax.swing.JOptionPane;

// Receba a temperatura em graus Celsius. Calcule e mostre a sua
// temperatura convertida em fahrenheit F = (9*C+160) /5.

public class LT01_EstSeq04
{
	public static void main(String args[])
	{
		double c, f;
		
		c = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em Celsius:"));
		f = ((c * 9) + 160) / 5;
		JOptionPane.showMessageDialog(null, "A temperatura em Farenheit é " + f);
	}
}