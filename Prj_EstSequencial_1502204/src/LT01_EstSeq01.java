import javax.swing.JOptionPane;

public class LT01_EstSeq01
{
	public static void main(String[] args)
	{
		int lado;
		int area;
		
		lado = Integer.parseInt(JOptionPane.showInputDialog("Informe o lado do quadrado:"));
		area = lado * lado;
		JOptionPane.showMessageDialog(null, "A área do quadrado é " + area);
	}
}