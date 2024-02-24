import Auxiliares.Entradas;

public class LT01_EstRep37
{
	public static void main(String[] args)
	{
		int n, atual, a, aa;
		Entradas ve = new Entradas();
		
		n = ve.valida_int_min("Insira um número inteiro", 0);
		aa = 0;
		System.out.println("Assumindo que: 0º termo = 0 e 1º termo = 1");
		System.out.println(aa);
		if (n > 0) {
			a = 1;
			System.out.println(a);
			if (n > 1) {
				for (int i = 2; i <= n; i++) {
					atual = a + aa;
					System.out.println(atual);
					aa = a;
					a = atual;
				}
			}
		}		
	}
}