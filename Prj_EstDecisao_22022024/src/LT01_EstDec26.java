import javax.swing.JOptionPane;

public class LT01_EstDec26
{
	public static void main(String args[])
	{
		int x, y, maior, menor;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("informe o primeiro número"));
		y = Integer.parseInt(JOptionPane.showInputDialog("informe o segundo número"));
		if (y > x) {
			maior = y;
			menor = x;
		}
		else {
			maior = x;
			menor = y;
		}
		if (maior % menor == 0)
			JOptionPane.showMessageDialog(null, maior + " é dívisível por " + menor);
		else
			JOptionPane.showMessageDialog(null, maior + " NÃO é divísivel por " + menor);
	}
}