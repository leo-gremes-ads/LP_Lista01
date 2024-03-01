import javax.swing.JOptionPane;
//import java.util.Arrays;
import java.util.Random;

public class LT01_Vetores02
{
	static Random rand;
	
	public static void main(String[] args)
	{
		int[] arr = new int[100];
		int maior, menor;
		double media;
		boolean random;
		
		random = preencherAleatorio();
		arr[0] = preencherVetor(random, 0);
		maior = arr[0];
		menor = arr[0];
		media = (double)arr[0];
		for (int i = 1; i < 100; i++) {
			arr[i] = preencherVetor(random, i);
			if (arr[i] < menor)
				menor = arr[i];
			if (arr[i] > maior)
				maior = arr[i];
			media += (double)arr[i];
		}
		media /= 100;
		JOptionPane.showMessageDialog(null, "Maior -> " + maior + "\nMenor -> " + menor);
		JOptionPane.showMessageDialog(null, "Média dos valores -> " + media);
		//System.out.println(Arrays.toString(arr));
	}
	
	static boolean preencherAleatorio()
	{
		String[] opts = {"Aleatório", "Manual"};
		
		if (JOptionPane.showOptionDialog(null, "Como deseja preencher o vetor?", "Escolha",
			JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opts, opts[0]) == 0) {
			rand = new Random();
			return true;
		}
		return false;
	}
	
	static int preencherVetor(boolean random, int i)
	{
		if (random)
			return rand.nextInt(2001) - 1000;
		return Integer.parseInt(JOptionPane.showInputDialog("Digite um número: [" + (i + 1) + "/100]"));
	}
}