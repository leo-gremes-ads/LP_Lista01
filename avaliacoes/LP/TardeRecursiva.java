import javax.swing.JOptionPane;

public class TardeRecursiva
{
    public static void main(String[] args)
    {
        int num;
        int resultado;
        
        while (true) {
            num = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite um número entre 5 e 18"
            ));
            if (num >= 5 && num <= 18)
                break;
            JOptionPane.showMessageDialog(null, "Número deve ser entre 5 e 18!!!");
        }
        resultado = serie(num);
        JOptionPane.showMessageDialog(null, "O resultado da resultado é: " + resultado);
    }

    private static int serie(int n)
    {
        if (n == 1)
            return 2;
        return doisElevadoA(n) + serie(n - 1);
    }

    private static int doisElevadoA(int n)
    {
        if (n == 1)
            return 2;
        // return 2 * doisElevadoA(n - 1);
        return produto(2, doisElevadoA(n - 1));
    }

    private static int produto(int x, int y)
    {
        if (x == 1)
            return y;
        return y + produto(x - 1, y);
    }
}
