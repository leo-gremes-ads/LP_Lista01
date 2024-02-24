import javax.swing.JOptionPane;

public class LT01_EstSeq11
{
	public static void main(String args[])
	{
		int raio;
		double area;

		raio = Integer.parseInt(JOptionPane.showInputDialog("Insira o raio: "));
		area = (raio * raio) * Math.PI;
		JOptionPane.showMessageDialog(null, "A área do Círculo é: " + area);
	}
}