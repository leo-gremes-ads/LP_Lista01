import javax.swing.JOptionPane;
import Auxiliares.Entradas;

public class LT01_EstRep36
{
	public static void main(String args[])
	{
		int n, fat;
		double serie;
		Entradas ve = new Entradas();
		
		n = ve.valida_int_min("Insira um número", 0);
		serie = 0;
		while (n >= 0)
			serie += (1 / (double)fatorial(n--));
		JOptionPane.showMessageDialog(null, "O resultado da série é: " + serie);
	}
	
	private static int fatorial(int n)
	{
		int fat = 1;
		
		while (n > 1)
			fat *= n--;
		return fat;
	}
}