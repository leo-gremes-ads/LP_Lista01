import javax.swing.JOptionPane;

public class LT01_EstDec27
{
	public static void main(String args[])
	{
		double voltas, ext, t, dist, v;

		voltas = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de voltas"));
		ext = Double.parseDouble(JOptionPane.showInputDialog("Informe a extensão do circuito (m)"));
		t = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo de duração (min)"));
		dist = voltas * ext;
		v = (dist / 1000) / (t / 60);
		JOptionPane.showMessageDialog(null, "A velocidade média é de " + v + " km/h");
	}
}