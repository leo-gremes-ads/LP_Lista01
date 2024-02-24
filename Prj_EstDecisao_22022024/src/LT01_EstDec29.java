import javax.swing.JOptionPane;

public class LT01_EstDec29
{
	public static void main(String args[])
	{
		int tipo;
		double vp,vf;

		tipo = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de investimento\n" +
			"1 - Poupança\n2 - Renda Fixa"));
		vp = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser investido"));
		if (tipo == 1)
			vf = vp + (vp * 0.03);
		else if (tipo == 2)
			vf = vp + (vp * 0.05);
		else
			vf = vp;
		JOptionPane.showMessageDialog(null, "O valor corrigido em 30 dias será R$ " + vf);
	}
}