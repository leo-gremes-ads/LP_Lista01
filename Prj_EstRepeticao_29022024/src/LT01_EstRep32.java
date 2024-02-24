import javax.swing.JOptionPane;

public class LT01_EstRep32
{
	public static void main(String args[])
	{
		int n, i, fat;
		
		n = entrada_valida();
		if (n > 12)
			JOptionPane.showMessageDialog(null, "O fatorial vai extrapolar a capacidade do int");
		fat = 1;
		i = n;
		while (i >= 1) {
			fat *= i--;
		}
		JOptionPane.showMessageDialog(null, "O fatorial de " + n + " é " + fat);
	}
	
	private static int entrada_valida()
	{
		String num;
		int n;
		
		do {
			num = JOptionPane.showInputDialog("Insira um número natural");
			try {
				n = Integer.parseInt(num);
				if (n < 0) {
					JOptionPane.showMessageDialog(null, "O número deve ser maior do que zero");
					continue;
				}
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Entrada inválida");
			}
		} while (true);
		return n;
	}
}