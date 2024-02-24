import javax.swing.JOptionPane;

public class LT01_EstSeq03
{
	public static void main(String args[])
	{
		int base, altura;
		double area;
		
		base = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da base:"));
		altura = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da altura:"));
		area = ((double)(base * altura)) / 2;
		JOptionPane.showMessageDialog(null, "A área do triângulo é " + area);
	}
}