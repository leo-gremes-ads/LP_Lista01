	import javax.swing.JOptionPane;

	/*
	Receba o valor de um depósito em poupança. Calcule e mostre o valor
	após 1 mês de aplicação sabendo que rende 1,3% a. m.
	*/
	public class LT01_EstSeq08
	{
		public static void main(String args[])
		{
			double vp, vf;
			
			vp = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor inicial"));
			vf = vp * 1.013;
			JOptionPane.showMessageDialog(null, "O valor final é: " + vf);
		}
	}