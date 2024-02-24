import javax.swing.JOptionPane;

public class LT01_EstDec21
{
	public static void main(String args[])
	{
		double n1, n2, n3, n4, media;

		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota"));
		n4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quarta nota"));
		media = (n1 + n2 + n3 + n4) / 4;
		if (media >= 6)
			JOptionPane.showMessageDialog(null, "Aprovado!\n(média: " + media + ")");
		else if (media >= 3)
			JOptionPane.showMessageDialog(null, "Exame!\n(média: " + media + ")");
		else
			JOptionPane.showMessageDialog(null, "Retido!\n(média: " + media + ")");
	}
}