import javax.swing.JOptionPane;

public class LT01_EstRep33
{
	public static void main(String[] args)
	{
		int n;
		double res;
		
		//VALIDAÇÃO DE ENTRADA -> NÚMERO INTEIRO MAIOR OU IGUAL A 1
		while (true) {
			try {
				n = Integer.parseInt((JOptionPane.showInputDialog("Informe um número inteiro maior ou igual a 1")));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Entrada inválida");
				continue;
			}
			if (n >= 1)
				break;
			JOptionPane.showMessageDialog(null, "Entrada inválida");
		}
		//PROGRAMA PRINCIPAL
		res = 0;
		while (n >= 1)
			res += (1 / (double)n--);
		JOptionPane.showMessageDialog(null, "O resultado da série é: " + res);	
	}
}