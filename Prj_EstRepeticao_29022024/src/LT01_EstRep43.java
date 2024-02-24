import javax.swing.JOptionPane;

public class LT01_EstRep43
{
	public static void main(String[] args)
	{
		double ana = 1.1;
		double maria = 1.5;
		int t = 0;
		
		while (maria >= ana)
		{
			maria += 0.02;
			ana += 0.03;
			t++;
		}
		JOptionPane.showMessageDialog(null, t + " anos");
	}
}