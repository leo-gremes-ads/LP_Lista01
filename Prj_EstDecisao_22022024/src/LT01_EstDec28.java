import javax.swing.JOptionPane;

public class LT01_EstDec28
{
	public static void main(String args[])
	{
		double atual, media, novo;

		atual = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço atual"));
		media = Double.parseDouble(JOptionPane.showInputDialog("Informe a média de vendas"));
		novo = atual;
		if (media < 500 && atual < 30)
			novo = atual + (atual * 0.1);
		if (media >= 500 && media < 1000 && atual >= 30 && atual < 80)
			novo = atual + (atual * 0.15);
		if (media >= 1000 && atual >= 80)
			novo = atual - (atual * 0.05);
		JOptionPane.showMessageDialog(null, "O novo preço será R$" + novo);
	}
}