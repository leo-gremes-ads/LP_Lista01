import Auxiliares.Entradas;

public class LT01_EstRep34
{
	public static void main(String[] args)
	{
		int n;
		Entradas ve = new Entradas();
		
		n = ve.inteiro_valido("Insira um número inteiro");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %2d = %d\n", n, i, n * i);
		}
	}
}