import auxiliares.*;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class LT01_Vetores08
{
	private static int lins = 4;
	private static int cols = 3;
	
	public static void main(String[] args)
	{
		int[][] mat = new int[lins][cols];
		int produto, semana, total;
		PreencherVetor pv = new PreencherVetor();
		ValidaEntrada ve = new ValidaEntrada();
		boolean random = pv.escolherPreenchimento();
		
		//PREENCHIMENTO E TOTAL
		total = 0;
		for (int lin = 0; lin < lins; lin++) {
			for (int col = 0; col < cols; col++) {
				mat[lin][col] = lerNumero(random, lin + 1, col + 1, pv, ve);
				total += mat[lin][col];
			}
		}
		System.out.println(Arrays.deepToString(mat).replace("],", "]\n"));
		//VENDAS POR PRODUTO
		for (int col = 0; col < cols; col ++) {
			produto = 0;
			for (int lin = 0; lin < lins; lin++)
				produto += mat[lin][col];
			JOptionPane.showMessageDialog(null, "A quantidade do produto" + (col + 1) +
				" vendida no mês foi: " + produto);
		}
		//VENDAS POR SEMANA
		for (int lin = 0; lin < lins; lin ++) {
			semana = 0;
			for (int col = 0; col < cols; col++)
				semana += mat[lin][col];
			JOptionPane.showMessageDialog(null, "A quantidade de produtos vendidos na semana " + 
				(lin + 1) + " foi: " + semana);
		}
		//VENDAS TOTAIS
		JOptionPane.showMessageDialog(null, "A quantidade total de produtos vendidos foi: " + total);	
	}
	
	private static int lerNumero(boolean random, int semana, int produto,
		PreencherVetor pv, ValidaEntrada ve)
	{
		String msg = "Digite a quantidade do produto " + produto +
			" vendido na semana " + semana;
		
		if (random)
			return pv.rngInt(0, 100);
		return ve.intMaiorIgual(msg, 0);
	}
}