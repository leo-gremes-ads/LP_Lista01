import auxiliares.*;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class LT01_Vetores05
{
	private static int tamanho = 21;
	
	public static void main(String[] args)
	{
		int[] arr = new int[tamanho];
		int soma = 0;
		boolean random;
		PreencherVetor pv = new PreencherVetor();
		ValidaEntrada ve = new ValidaEntrada();
		
		random = pv.escolherPreenchimento();		
		for (int i = 1;  i < tamanho; i++) {
			arr[i] = lerNumero("Digite um número inteiro: [" + i + "/" + (tamanho - 1) + "]",
				random, pv, ve);
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 1; i <= (tamanho / 2) ; i++)
			soma += (arr[i] - arr[tamanho - i]);
		JOptionPane.showMessageDialog(null, "A soma é: " + soma);
	}
	
	public static int lerNumero(String msg, boolean random,
		PreencherVetor pv, ValidaEntrada ve)
	{
		if (random)
			return pv.rngInt(-50, 50);
		return ve.intValido(msg);
	}
}
