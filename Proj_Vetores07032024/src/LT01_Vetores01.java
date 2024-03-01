import javax.swing.JOptionPane;
import java.util.Random;
//import java.util.Arrays;
        
public class LT01_Vetores01
{
    static Random rand = new Random();
	
	public static void main(String[] args)
    {
        int[] arr = new int[50];
        int impares = 0;
        int cont = 0;
		double media = 0;
		String[] opts = {"Aleatório", "Manual"};
		boolean random;
		
		//DECIDINDO SE PREENCHIMENTO MANUAL OU ALEATÓRIO - DEVERIA SER MODULARIZADO
		if (JOptionPane.showOptionDialog(null, "Como deseja preencher o vetor?", "Escolha",
			JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opts, opts[1]) == 0)
			random = false;
		else
			random = true;
        
        //PROGRMAMA
		for(int i = 0; i < 50; i++) {
			arr[i] = lerNumero(random, i);
			if (arr[i] >= 10 && arr[i] <= 200) {
				cont++;
				media += (double)arr[i];
			}
			if (arr[i] % 2 == 1)
				impares += arr[i];
		}
		if (cont > 0)
			media = media / cont;
		JOptionPane.showMessageDialog(null, "Média dos números entre 10 e 200: " + media);
		JOptionPane.showMessageDialog(null, "Soma dos ímpares: " + impares);
		//System.out.println(Arrays.toString(arr));
    }
	
	private static int lerNumero(boolean random, int i)
	{	
		if (random)
			return Integer.parseInt(JOptionPane.showInputDialog("Insira um número [" + (i + 1) + "/50]"));
		return rand.nextInt(1001);
	}
}