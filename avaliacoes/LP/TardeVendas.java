import javax.swing.JOptionPane;
import java.util.Random;

public class TardeVendas
{
    private static final int QTD_MESES = 36;
    private static final int QTD_PRODUTOS = 300;

    // QUESTÃO 3
    public static void main(String[] args)
    {
        int[][] vendas = new int[QTD_MESES][QTD_PRODUTOS];
        int opt = 0;

        while (opt != 9) {
            opt = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Carregar Matriz\n2 - Mostrar Estatisticas\n9 - Sair"));
            if (opt == 1) {
                carregarMatriz(vendas);
                JOptionPane.showMessageDialog(null, "Matriz Carregada");
                //mostrarMatriz(notas);
            }
            else if (opt == 2)
                mostrarEstatisticas(vendas);
            else if (opt != 9)
                System.out.println("Opção Inválida!");
        }
    }

    //  QUESTÃO 1
    private static void carregarMatriz(int[][] matriz)
    {
        int minimo = 20;
        int maximo = 5000;
        int valor;

        for (int mes = 0; mes < QTD_MESES; mes++) {
            for (int prod = 0; prod < QTD_PRODUTOS; prod++) {
                while (true) {
                    valor = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite a quantidade vendida do produto " + prod + " no mês " + mes));
/* PREENCHER MATRIZ COM VALORES ALEATÓRIOS PARA EVITAR TRABALHO REPETITIVO E FACILITAR TESTES */
                        if (valor == 0) {
                        preencherAleatorio(matriz, prod, mes, minimo, maximo);
                        return;
                    }
/* LÓGICA DA PROVA CONTINUA ABAIXO */
                    if (valor >= minimo && valor <= maximo)
                        break;
                    JOptionPane.showMessageDialog(null, "Valor inválido!");
                    
                }
                matriz[mes][prod] = valor;
            }
        }
    }

    // QUESTÃO 2
    private static void mostrarEstatisticas(int[][] matriz)
    {
        if (matriz == null) return;

        int[] totalVendas = new int[QTD_PRODUTOS];
        double[] media = new double[QTD_PRODUTOS];

        for (int prod = 0; prod < QTD_PRODUTOS; prod++) {
            for(int mes = 0; mes < QTD_MESES; mes++)
                totalVendas[prod] += matriz[mes][prod];
            System.out.printf("Total vendido do produto %d: %d\n", prod, totalVendas[prod]);
        }
        System.out.println("----------------------------------------------------------------------");
        for (int prod = 0; prod < QTD_PRODUTOS; prod++)
            media[prod] = totalVendas[prod] / (double)QTD_MESES;
        for (int prod = 0; prod < QTD_PRODUTOS; prod++) {
            System.out.printf("Média mensal do produto %d: %.2f\n", prod, media[prod]);
            for (int mes = 0; mes < QTD_MESES; mes++) {
                if ((double)matriz[mes][prod] < media[prod])
                    System.out.printf("\tMês %d abaixo da média: %d\n", mes, matriz[mes][prod]);
            }
        }
    }


    // SUPORTE
    private static void preencherAleatorio(int[][] matriz, int prod, int mes, int minimo, int maximo)
    {
        Random r = new Random(10);

        //termina linha
        for (int col = prod; col < QTD_PRODUTOS; col++)
            matriz[mes][col] = r.nextInt(maximo - minimo + 1) + minimo;
        //preenche as outras linhas
        for (int lin = mes; lin < QTD_MESES; lin++) {
            for (int col = 0; col < QTD_PRODUTOS; col++)
                matriz[lin][col] = r.nextInt(maximo - minimo + 1) + minimo;
        }
    }

    private static void mostrarMatriz(int[][] matriz) 
    {
        for (int lin = 0; lin < QTD_MESES; lin++) {
            for (int col = 0; col < QTD_PRODUTOS; col++)
                System.out.printf("%5d  ", matriz[lin][col]);
            System.out.println();
        }
    }
}