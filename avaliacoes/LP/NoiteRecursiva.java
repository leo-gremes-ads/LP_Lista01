/* Série N¹ + (N - 1)² + ... + 1^n */

import javax.swing.JOptionPane;

public class NoiteRecursiva
{
    public static void main(String[] args)
    {
        int num = 0;
        int resultado;

        while (num < 2 || num > 10) {
            num = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite um número entre 2 e 10"
            ));
        }
        resultado = serie(num, 1);
        JOptionPane.showMessageDialog(null, "O resultado da série é: " + resultado);
    }

    private static int serie(int n, int i)
    {
        if (n == 1)
            return 1;
        return potencia(n, i) + serie(n - 1, i + 1);
    }

    private static int potencia(int base, int exp)
    {
        if (exp == 1)
            return base;
        // return base * potencia(base, exp - 1);
        return produto(base, potencia(base, exp - 1));
    }

    private static int produto(int a, int b)
    {
        if (a == 1)
            return b;
        return b + produto(a - 1, b);
    }
}
