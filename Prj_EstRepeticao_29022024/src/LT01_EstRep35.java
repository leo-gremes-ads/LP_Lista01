import javax.swing.JOptionPane;
import Auxiliares.Entradas;

public class LT01_EstRep35
{
	public static void main(String[] args)
	{
		int n1, n2, aux, soma;
		Entradas ve = new Entradas();
		
		n1 = ve.inteiro_valido("Insira um número inteiro");
		n2 = ve.inteiro_valido("Insira outro número inteiro");	
		if (n2 > n1) {
			aux = n2;
			n2 = n1;
			n1 = aux;
		}
		soma = 0;
		aux = n2 + 1;
		while (aux < n1) {
			if (aux % 2 != 0) // -> para funcionar com números negativos
				soma += aux;
			aux++;
		}
		JOptionPane.showMessageDialog(null, "A soma dos ímpares entre " + n2 +
			" e " + n1 + " (não inclusos) é: " + soma);
	}
}