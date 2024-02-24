public class LT01_EstRep39
{
	public static void main(String[] args)
	{
		long qtd;
		
		qtd = 1;
		for (int i = 1; i <= 64; i++){
			System.out.printf("Casa %2d -> Qtd: %s\n", i, Long.toUnsignedString(qtd));
			qtd *= 2;
		}
	}		
}