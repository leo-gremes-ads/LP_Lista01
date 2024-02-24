import javax.swing.JOptionPane;

public class LT01_EstSeq12
{
	public static void main(String args[])
	{
		int nasc, atual, idade, fut;

		nasc = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de nascimento:"));
		atual = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual:"));
		idade = atual - nasc;
		fut = idade + 17;
		JOptionPane.showMessageDialog(null, "A idade atual é " + idade +
		" anos\nA idade daqui a 17 anos será " + fut + " anos");
	}
}