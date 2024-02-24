import javax.swing.JOptionPane;

public class LT01_EstSeq02
{
	public static void main(String args[])
	{
		double atual, novo;
		
		atual = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário Atual:"));
		novo = atual * 1.15;
		JOptionPane.showMessageDialog(null, "O novo salário será R$ " + novo);
	}
}