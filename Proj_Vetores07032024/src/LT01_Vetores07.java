import auxiliares.*;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class LT01_Vetores07
{
	private static int tamanho = 20;
	
	public static void main(String[] args)
	{
		
		//EXERCÍCIO 6
		int[] arr = new int[tamanho];
		int alvo, indice;
		PreencherVetor pv = new PreencherVetor();
		ValidaEntrada ve = new ValidaEntrada();
		boolean random = pv.escolherPreenchimento();
		
		for (int i = 0; i < tamanho; i++) {
			arr[i] = lerNumero("Digite um número [" + (i + 1) + "/" + tamanho + "]",
				random, pv, ve);
		}
		insertSort(arr, tamanho);
		
		//EXERCÍCIO 7
		alvo = ve.intValido("Escolha o número que deseja encontrar:");
		indice = pesquisaBinaria(arr, alvo);
		if (indice == -1)
			JOptionPane.showMessageDialog(null, "Esse número não existe!");
		else
			JOptionPane.showMessageDialog(null, "O número está no índice: " + indice);
	}
	
	private static int pesquisaBinaria(int[] arr, int alvo)
	{
		return pesquisaBinaria(arr, alvo, 0, arr.length - 1);
	}
	
	private static int pesquisaBinaria(int[] arr, int alvo, int inicio, int fim)
	{
		int meio = (inicio + fim) / 2;
		
		if (fim < inicio)
			return -1;
		if (arr[meio] == alvo)
			return meio;
		if (arr[meio] > alvo)
			return pesquisaBinaria(arr, alvo, inicio, meio - 1);
		return pesquisaBinaria(arr, alvo, meio + 1, fim);
	}
	
	private static int lerNumero(String msg, boolean random,
		PreencherVetor pv, ValidaEntrada ve)
	{
		if (random)
			return pv.rngInt(0, 300);
		return ve.intValido(msg);
	}
	
	private static void insertSort(int[] arr, int tamanho)
	{
		int tmp, j;
		
		System.out.println("Original:\n" + Arrays.toString(arr));		
		for (int i = 1; i < tamanho; i++) {
			tmp = arr[i];
			j = i - 1;
			while (j >= 0 && tmp < arr[j])
				arr[j + 1] = arr[j--];
			arr[j + 1] = tmp;
		}
		System.out.println("Ordenado:\n" + Arrays.toString(arr));
	}
}
