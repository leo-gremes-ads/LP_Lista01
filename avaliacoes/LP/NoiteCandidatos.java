import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class NoiteCandidatos
{
    private static final int QTD_CANDIDATOS = 500;
    private static final int[] LIMITES = {16, 20, 10, 15};
    private static final int QTD_AREAS = LIMITES.length;
    
    // QUESTÃO 3
    public static void main(String[] args)
    {
        int[][] notas = null;
        int op = 0;

        while (op != 9) {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                "Selecione a opção desejada:\n\n1 - Carregar matriz\n2 - Mostrar Estatisticas\n9 - Sair"
            ));
            if (op == 1) {
                notas = carregarMatriz();
                //mostrarMatriz(notas);
            }
            else if (op == 2)
                mostrarEstatisticas(notas);
            else if (op != 9)
                JOptionPane.showMessageDialog(null, "Opção Inválida!");
        }
        JOptionPane.showMessageDialog(null, "Programa Encerrado!");
    }

    // QUESTÃO 1
    private static int[][] carregarMatriz()
    {
        int[][] matriz = new int[QTD_CANDIDATOS][QTD_AREAS];
        int valor;
        
        for (int c = 0; c < QTD_CANDIDATOS; c++) {
            for (int a = 0; a < QTD_AREAS; a++) {
                while (true) {
                    valor = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite a nota do candidato " + c + " na área " + a + " (max = " + LIMITES[a] + ")"
                    ));
/* PREENCHER MATRIZ COM NÚMEROS ALEATÓRIOS PARA EVITAR TRABALHO REPETITIVO E FACILITAR OS TESTES */
                    if (valor == -10) {
                        preencherAleatorio(matriz);
                        return matriz;
                    }
/* LÓGICA DA PROVA CONTINUA ABAIXO */
                    if (valor >= 0 && valor <= LIMITES[a]) {
                        matriz[c][a] = valor;
                        break;
                    }
                    JOptionPane.showMessageDialog(null, "Valor inválido!");
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Matriz carregada");
        return matriz;
    }

    // QUESTÃO 2
    private static void mostrarEstatisticas(int[][] notas)
    {
        int[] notaFinal = new int[QTD_CANDIDATOS];
        int aux, pos;
        int notaMostrada = 1;

        for(int c = 0; c < QTD_CANDIDATOS; c++) {
            for (int a = 0; a < QTD_AREAS; a++)
                notaFinal[c] += notas[c][a];
        }

        // BUBBLE SORT
        for (int i = 0; i < QTD_CANDIDATOS - 1; i++) {
            for (int j = i + 1; j < QTD_CANDIDATOS; j++) {
                if (notaFinal[j] > notaFinal[i]) {
                    aux = notaFinal[i];
                    notaFinal[i] = notaFinal[j];
                    notaFinal[j] = aux;
                }
            }
        }

        // 100 maiores notas diferentes
        //System.out.println(Arrays.toString(notaFinal));
        System.out.println("---------- 100 maiores notas diferntes ----------");
        pos = 0;
        while (pos < QTD_CANDIDATOS && notaMostrada <= 100) {
            aux = notaFinal[pos];
            System.out.println(notaMostrada + "a maior nota = " + aux);
            notaMostrada++;
            while (pos < QTD_CANDIDATOS && notaFinal[pos] == aux)
                pos++;
        }
    }

    // SUPORTE
    private static void preencherAleatorio(int[][] matriz)
    {
        Random r = new Random(10);
        
        for (int lin = 0; lin < QTD_CANDIDATOS; lin++) {
            for (int col =0; col < QTD_AREAS; col++) {
                if (matriz[lin][col] == 0)
                    matriz[lin][col] = r.nextInt(LIMITES[col]);
            }
        }
    }

    private static void mostrarMatriz(int[][] matriz)
    {
        for (int lin = 0; lin < QTD_CANDIDATOS; lin++) {
            for (int col = 0; col < QTD_AREAS; col++) {
                System.out.printf("%4d ", matriz[lin][col]);
            }
            System.out.println();
        }
    }
}
