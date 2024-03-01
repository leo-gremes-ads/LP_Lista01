import javax.swing.JOptionPane;
import java.util.Arrays;

public class LT01_Vetores03
{
	public static void main(String[] args)
	{
		int[] vt1 = new int[3];
		int[] vt2 = new int[3];
		int[] vt3 = new int[6];
		
		for (int i = 0; i < 3; i++) {
			vt1[i] = inteiroValido("vt1", i);
			vt3[i] = vt1[i];
		}
		for (int i = 0; i < 3; i++) {
			vt2[i] = inteiroValido("vt2", i);
			vt3[i + 3] = vt2[i];
		}
		JOptionPane.showMessageDialog(null, "vt3 => " + Arrays.toString(vt3));
	}
	
	private static int inteiroValido(String vetor, int i)
	{
		String num;
		int n;
		
		do {
			num = JOptionPane.showInputDialog("Preencha " + vetor + ": [" + (i + 1) + "/3]");
			if (num == null) {
				JOptionPane.showMessageDialog(null, "Programa Encerrado!!");
				System.exit(0);
			}
			try {
				n = Integer.parseInt(num);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Número inválido. Digite novamente");
				continue;
			}
			break;
		} while (true);
		return n;
	}
}
