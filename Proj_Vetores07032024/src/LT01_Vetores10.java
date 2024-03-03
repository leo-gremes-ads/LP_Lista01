import java.util.Arrays;

public class LT01_Vetores10
{
	private static int tamanho = 8;
	
	public static void main(String[] args)
	{
		long[][] mat = new long[tamanho][tamanho];
		long n;
		
		n = 1;
		for (int lin = 0; lin < tamanho; lin++) {
			for (int col = 0; col < tamanho; col++) {
				mat[lin][col] = n;
				n *= 2;
			}
		}
		System.out.println(Arrays.deepToString(mat).replace("],", "]\n"));
	}
}
