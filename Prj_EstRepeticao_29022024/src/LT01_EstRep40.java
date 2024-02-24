import Auxiliares.Entradas;

public class LT01_EstRep40
{
	public static void main(String[] args)
	{
		int maior, menor, aux;
		Entradas ve = new Entradas();
		
		maior = ve.inteiro_valido("Digite o 1º número");
		menor = ve.inteiro_valido("Digite o 2º número");
		if (maior < menor) {
			aux = maior;
			maior = menor;
			menor = aux;
		}
		System.out.println("Primos entre " + menor + " e " + maior + ":");
		while (menor <= maior) {
			if (ehPrimo(menor))
				System.out.println(menor);
			menor++;
		}
	}
	
	private static boolean ehPrimo(int n)
	{
		if (n <= 1)
			return false;
		if (n <= 3)
			return true;
		for (int i = 2; i < n; i++)
		{
			if (n % i == 0) return false;
		}
		return true;
	}		
}