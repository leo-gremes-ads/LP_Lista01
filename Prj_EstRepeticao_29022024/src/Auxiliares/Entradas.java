package Auxiliares;

import javax.swing.JOptionPane;

public class Entradas
{
	public int inteiro_valido(String mensagem)
	{
		int n;
		
		while (true) {
			try {
				n = Integer.parseInt(
					JOptionPane.showInputDialog(mensagem));
				break;
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Entrada inválida");
			}
		}
		return n;
	}
	
	public int valida_int_min_max(String mensagem, int min, int max)
	{
		int n;
		
		while (true) {
			n = inteiro_valido(mensagem);
			if (n >= min && n <= max) break;
			JOptionPane.showMessageDialog(null, "Número fora dos limites");
		}
		return n;
	}
	
	public int valida_int_min(String mensagem, int min)
	{
		return valida_int_min_max(mensagem, min, Integer.MAX_VALUE);
	}
	
	public int valida_int_max(String mensagem, int max)
	{
		return valida_int_min_max(mensagem, Integer.MIN_VALUE, max);
	}
}
