import javax.swing.JOptionPane;
import java.util.Arrays;
import auxiliares.ValidaEntrada;

public class LT01_Vetores12
{
	private static int[][] tabuleiroPadrao =
	{{2, 4, 3, 5, 6, 3, 4, 2},
	 {1, 1, 1, 1, 1, 1, 1, 1},
	 {7, 7, 7, 7, 7, 7, 7, 7},
	 {7, 7, 7, 7, 7, 7, 7, 7},
	 {7, 7, 7, 7, 7, 7, 7, 7},
	 {7, 7, 7, 7, 7, 7, 7, 7},
	 {1, 1, 1, 1, 1, 1, 1, 1},
	 {2, 4, 3, 5, 6, 3, 4, 2}};
	
	public static void main(String[] args)
	{
		int[] contPecas = new int[8];
		int[][] tabuleiro = new int[8][8];
		String res;
		
		preencherTabuleiro(tabuleiro);
		System.out.println(Arrays.deepToString(tabuleiro).replace("],", "]\n"));
		contarPecas(tabuleiro, contPecas);
		res = 
			"Contagem das peças:\n" +
			"\n1 - Peão: " + contPecas[1] +
			"\n2 - Torre: " + contPecas[2] +
			"\n3 - Bispo: " + contPecas[3] +
			"\n4 - Cavalo: " + contPecas[4] +
			"\n5 - Rainha: " + contPecas[5] +
			"\n6 - Rei: " + contPecas[6] +
			"\n7 - Vazio: " + contPecas[7];
		JOptionPane.showMessageDialog(null, res);
	}
	
	private static void contarPecas(int[][] tabuleiro, int[] contagem)
	{
		for (int lin = 0; lin < 8; lin++) {
			for (int col = 0; col < 8; col++) {
				contagem[tabuleiro[lin][col]]++;
			}
		}
	}
	
	private static boolean escolherTabuleiro()
	{
		String[] opts = {"Inicial", "Preencher Manualmente"};
		
		return JOptionPane.showOptionDialog(null, "Escolha o estado do tabuleiro", "Escolha",
			JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opts, opts[0]) == 0;
	}
	
	private static void preencherTabuleiro(int[][] tabuleiro)
	{
		boolean random = escolherTabuleiro();
		ValidaEntrada ve = new ValidaEntrada();
		String msg;
		
		for (int lin = 0; lin < 8; lin ++) {
			for (int col = 0; col < 8; col++) {
				if (random)
					tabuleiro[lin][col] = tabuleiroPadrao[lin][col];
				else {
					msg = "Digite a peça que está na casa: " + enderecoCasa(lin, col) +
						"\n\n1 - Peão\n2 - Torre\n3 - Bispo\n4 - Cavalo\n5 - Rainha\n6 - Rei\n 7 - Vazio";
					tabuleiro[lin][col] = ve.intEntre(msg, 1, 7);
				}
			}
		}
	}
	
	private static String enderecoCasa(int lin, int col)
	{
		String endereco = "";
		
		switch (col) {
			case 0: endereco = "A"; break;
			case 1: endereco = "B"; break;
			case 2: endereco = "C"; break;
			case 3: endereco = "D"; break;
			case 4: endereco = "E"; break;
			case 5: endereco = "F"; break;
			case 6: endereco = "G"; break;
			case 7: endereco = "H"; break;
			default: System.exit(1);
		}
		endereco += Integer.toString(8 - lin);
		return endereco;
	}
}