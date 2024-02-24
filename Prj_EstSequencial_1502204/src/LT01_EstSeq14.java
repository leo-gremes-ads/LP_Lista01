import javax.swing.JOptionPane;

public class LT01_EstSeq14
{
	public static void main(String args[])
	{
		int a1, a2, a3;

		a1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1º ângulo:"));
		a2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 2º ângulo:"));
		a3 = 180 - a1 - a2;
		JOptionPane.showMessageDialog(null, "O terceiro ângulo tem " + a3 + " graus");
	}
}