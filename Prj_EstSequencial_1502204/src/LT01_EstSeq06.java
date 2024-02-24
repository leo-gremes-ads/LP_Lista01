import javax.swing.JOptionPane;

/*
Receba os valores em x e y. Efetua a troca de seus valores e mostre seus
conteúdos.
*/

public class LT01_EstSeq06
{
	public static void main(String args[])
	{
		int x, y, aux;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Informe o X"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Informe o Y"));
		aux = x;
		x = y;
		y = aux;
		JOptionPane.showMessageDialog(null, "Valor de x -> " + x + "\nValor de y -> " + y);
	}    
}