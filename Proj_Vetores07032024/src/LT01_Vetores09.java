import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Random;

public class LT01_Vetores09
{
	private static int tamanho = 4;
	
	public static void main(String[] args)
	{
		int[][] mat = new int[tamanho][tamanho];
		Random r = new Random();
		
		for (int lin = 0; lin < tamanho; lin++) {
			for (int col = 0; col < tamanho; col++) {
				if (col == lin)
					mat[lin][col] = (int)Math.pow(4, lin);
				else
					mat[lin][col] = r.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(mat).replace("],", "]\n"));
	}
}