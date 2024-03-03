import java.util.Arrays;

public class LT01_Vetores11
{
	private static int tamanho = 8;
	
	public static void main(String[] args)
	{
		int[][] mat = new int[tamanho][tamanho];
		
		for (int camada = 0; camada <= tamanho / 2; camada++)
		{
			for (int lin = 0 + camada; lin < tamanho - camada; lin++) {
				for (int col = 0 + camada; col < tamanho - camada; col++) {
					mat[lin][col] = camada + 1;
				}
			}
		}
		System.out.println(Arrays.deepToString(mat).replace("],", "]\n"));
	}
}
