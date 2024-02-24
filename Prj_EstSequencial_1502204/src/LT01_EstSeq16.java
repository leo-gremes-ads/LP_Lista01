import javax.swing.JOptionPane;

public class LT01_EstSeq16
{
	public static void main(String args[])
	{
		double ht, vh, desconto, brt, liq;
		int descendentes;

		ht = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas"));
		vh = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da hora trabalhada"));
		desconto = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de desconto\n" + 
		"(Em decimal. ex.: 10% -> 0.1)"));
		descendentes = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de descendentes"));
		
		brt = ht * vh;
		liq = brt - (brt * desconto) + (100 * descendentes);

		JOptionPane.showMessageDialog(null, "O salário bruto será R$ " + brt +
		"\nO salário líquido será R$ " + liq);
	}
}