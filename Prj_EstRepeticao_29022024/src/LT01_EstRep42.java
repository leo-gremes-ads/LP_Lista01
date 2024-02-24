import javax.swing.JOptionPane;

public class LT01_EstRep42
{
	public static void main(String[] args)
	{
		int i, j;
		double serie;
		
		serie = 0;
		i = 1;
		j = 1;
		while (i <= 50) {
			serie += (i++ / (double)j);
			j = j + 2;
		}
		JOptionPane.showMessageDialog(null, "O resultado da série é: " + serie);
	}
}