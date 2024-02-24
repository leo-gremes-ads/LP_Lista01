import javax.swing.JOptionPane;

public class LT01_EstSeq13
{
	public static void main(String args[])
	{
		double qtd, t;
		
		qtd = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de alimento em Kg:"));
		t = qtd / 0.05;
		JOptionPane.showMessageDialog(null, "O alimento irá durar " + t + " dias");
	}
}