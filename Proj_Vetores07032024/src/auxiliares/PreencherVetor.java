package auxiliares;

import javax.swing.JOptionPane;
import java.util.Random;

public class PreencherVetor
{
	public Random rand;
	
	public PreencherVetor()
	{
		super();
	}
	
	public boolean escolherPreenchimento()
	{
		String[] opts = {"Aleatório", "Manual"};
		
		if (JOptionPane.showOptionDialog(null, "Como deseja preencher o vetor?", "EScolha",
			JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opts, opts[0]) == 0) {
			rand = new Random();
			return true;
		}
		return false;
	}
	
	public int rngInt(int min, int max)
	{
		return rand.nextInt(max - min + 1) - min;
	}
	
	public double rngDouble(double min, double max)
	{
		int maxInt, minInt;
		
		maxInt = (int)(max * 100);
		minInt = (int)(min * 100);
		return (rand.nextInt(maxInt - minInt) - minInt) / 100;
	}
}
