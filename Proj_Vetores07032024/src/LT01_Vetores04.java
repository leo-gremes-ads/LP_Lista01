import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Random;

public class LT01_Vetores04
{
	private static int tamanho = 30;
	private static Random rand;
	
	public static void main(String[] args)
	{
		double[] arr = new double[tamanho];
		double media = 0;
		int acima = 0;
		int[] abaixo = new int[tamanho];
		int j = 0;
		boolean random = escolherAleatorio();
		
		for (int i = 0; i < tamanho; i++) {
			arr[i] = preencherVetor(random, i);
			media += arr[i];
		}
		media /= tamanho;
		for (int i = 0; i < tamanho; i++) {
			if (arr[i] > media)
				acima++;
			else
				abaixo[j++] = i;
		}
		System.out.println(Arrays.toString(arr));
		JOptionPane.showMessageDialog(null, "Número de valores acima da média: " + acima);
		JOptionPane.showMessageDialog(null, "Posições dos valores abaixo da média:\n" +
			Arrays.toString(Arrays.copyOfRange(abaixo, 0, tamanho - acima)));
	}
	
	private static boolean escolherAleatorio()
	{
		String[] opts = {"Aleatório", "Manual"};
		
		if (JOptionPane.showOptionDialog(null, "Como deseja preencher o vetor?", "EScolha",
			JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opts, opts[0]) == 0) {
			rand = new Random();
			return true;
		}
		return false;
	}
		
	private static double preencherVetor(boolean random, int i)
	{
		if (random)
			return (double)rand.nextInt(10001) / 100;
		return
			doubleValido(i);
	}
	
	private static double doubleValido(int i)
	{
		String txt;
		double n;
		
		while (true) {
			txt = JOptionPane.showInputDialog("Informe um número: [" + (i + 1) + "/" + tamanho + "]");
			if (txt == null)
				System.exit(0);
			try {
				n = Double.parseDouble(txt);
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Inválido, tente novamente.");
				continue;
			}
			break;
		}
		return n;
	}
}