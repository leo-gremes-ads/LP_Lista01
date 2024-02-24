import javax.swing.JOptionPane;

public class LT01_EstRep38
{
	public static void main(String args[])
	{
		int i, atual, menor;
		
		i = 0;
		menor = 0;
		atual = entrada_valida("Digite o 1º número", i, menor);
		menor = atual;
		i++;
		while (i < 100) {
			atual = entrada_valida("Digite o " + (i + 1) + "º número:\n" +
				"Menor número até o momento: " + menor, i , menor);
			if (atual < menor)
				menor = atual;
			i++;
		}
		
	}
	
	private static int entrada_valida(String mensagem, int i, int menor)
	{
		String txt;
		int n;
		
		while (true) {
			txt = JOptionPane.showInputDialog(mensagem);
			if (txt == null) encerrar(i, menor);
			try {
				n = Integer.parseInt(txt);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Entrada Inválida");
				continue;
			}
			if (n < 0) {
				JOptionPane.showMessageDialog(null, "Número deve ser maior ou igual a 0");
				continue;
			}
			break;
		}
		return n;
	}
		
	private static void encerrar(int i, int menor)
	{
		if (i == 0){
			JOptionPane.showMessageDialog(null, "Programa encerrado!");
			System.exit(0);
		}
		else {
			JOptionPane.showMessageDialog(null, "Programa encerrado!");
			JOptionPane.showMessageDialog(null, "Menor número até o momento: " + menor);
			System.exit(0);
		}
	}		
}