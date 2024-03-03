package auxiliares;

import javax.swing.JOptionPane;

public class ValidaEntrada
{
	public ValidaEntrada()
	{
		super();
	}
	
	public int intEntre(String msg, int min, int max)
	{
		String txt;
		int n;
		
		do {
			txt = JOptionPane.showInputDialog(msg);
			if (txt == null) {
				JOptionPane.showMessageDialog(null, "Programa encerrado!");
				System.exit(0);
			}
			try {
				n = Integer.parseInt(txt);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Entrada inválida!");
				continue;
			}
			if (n >= min && n <= max)
				break;
			JOptionPane.showMessageDialog(null, "Número fora do intervalo!");
		} while (true);
		return n;
	}
	
	public int intMaiorIgual(String msg, int min)
	{
		return intEntre(msg, min, Integer.MAX_VALUE);
	}
	
	public int intMenorIgual(String msg, int max)
	{
		return intEntre(msg, Integer.MIN_VALUE, max);
	}
	
	public int intValido(String msg)
	{
		return intEntre(msg, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public double doubleValido(String msg, double min, double max)
	{
		String txt;
		double n;
		
		do {
			txt = JOptionPane.showInputDialog(msg);
			if (txt == null) {
				JOptionPane.showMessageDialog(null, "Programa encerrado!");
				System.exit(0);
			}
			try {
				n = Double.parseDouble(txt);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Entrada inválida!");
				continue;
			}
			if (n >= min && n <= max)
				break;
			JOptionPane.showMessageDialog(null, "Número fora do intervalo!");
		} while (true);
		return n;
	}
}

