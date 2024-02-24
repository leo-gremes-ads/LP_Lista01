import javax.swing.JOptionPane;

public class LT01_EstDec25
{
	public static void main(String args[])
	{
		int hi, mi, hf, mf, hj, mj;

		hi = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora inicial"));
		mi = Integer.parseInt(JOptionPane.showInputDialog("Informe os minutos da hora inicial"));
		hf = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora final"));
		mf = Integer.parseInt(JOptionPane.showInputDialog("Informe os minutos da hora final"));
		if (mf < mi) {
			mf += 60;
			hf--;
		}
		if (hf < hi)
			hf += 24;
		hj = hf - hi;
		mj = mf - mi;
		JOptionPane.showMessageDialog(null, "O jogo durou " + hj + " horas e " + mj + " minutos");
	}
}