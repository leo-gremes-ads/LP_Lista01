import Auxiliares.Entradas;
import javax.swing.JOptionPane;

public class LT01_EstRep44
{
	public static void main(String args[])
	{
		int base, expoente;
		double res;
		Entradas ve = new Entradas();
		
		base = ve.inteiro_valido("Informe a base");
		expoente = ve.inteiro_valido("Informe o expoente");
		res = 1;
		while (expoente != 0)
		{
			// !! EXPOENTE NEGATIVO SE CALCULA UTILIZANDO O INVERSO DA BASE PELO EXPOENTE POSITIVO
			// ex.:  10 ^ -1 = (1 / 10) ^ 1 = 0.1
			if (expoente < 0) {
				res *= (1 / (double)base);
				expoente++;
			} else {
				res *= base;
				expoente--;
			}
		}
		JOptionPane.showMessageDialog(null, "O resultado é: " + res);
	}
}