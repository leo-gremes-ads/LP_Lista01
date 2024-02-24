import javax.swing.JOptionPane;

public class LT01_EstSeq17
{
	public static void main(String args[])
	{
		double t, v, d, q;

		t = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo da viagem"));
		v = Double.parseDouble(JOptionPane.showInputDialog("Informe a velocidade média"));
		d = v * t;
		q = d / 12;
		JOptionPane.showMessageDialog(null, "O consumo será de " + q +
		" litros\n(distância = " + d + " km)");
	}
}
