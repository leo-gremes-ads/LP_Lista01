import auxiliares.*;
import java.util.Arrays;

public class LT01_Vetores06
{
	private static int tamanho = 20;
	
	public static void main(String[] args)
	{
		int[] arr = new int[tamanho];
		int j, tmp;
		PreencherVetor pv = new PreencherVetor();
		ValidaEntrada ve = new ValidaEntrada();
		boolean random = pv.escolherPreenchimento();
		
		for (int i = 0; i < tamanho; i++) {
			arr[i] = lerNumero("Digite um número [" + (i + 1) + "/" + tamanho + "]",
				random, pv, ve);
		}
		System.out.println("Original:\n" + Arrays.toString(arr));
		
		//INSERT SORT
		for (int i = 1; i < tamanho; i++) {
			tmp = arr[i];
			j = i - 1;
			while (j >= 0 && tmp < arr[j])
				arr[j + 1] = arr[j--];
			arr[j + 1] = tmp;
		}
		// FIM INSERT SORT
		System.out.println("Ordenado:\n" + Arrays.toString(arr));
	}
	
	private static int lerNumero(String msg, boolean random,
		PreencherVetor pv, ValidaEntrada ve)
	{
		if (random)
			return pv.rngInt(0, 300);
		return ve.intValido(msg);
	}
}