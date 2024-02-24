import javax.swing.JOptionPane;

public class LT01_EstRep45
{
	public static void main(String[] args)
	{
		double serie = 0;
		int sinal = 1;
		
		for (int i = 1; i <= 15; i++) {
			serie += (((double)i / (i * i)) * sinal);
			sinal *= -1;
		}
		JOptionPane.showMessageDialog(null, "O resultado da série é: " + serie);
	}
}