import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class NoiteCandidatos
{
    private static final int QTD_CANDIDATOS = 80000;
    private static final int[] LIMITES = {16, 30, 24, 10};
    private static final int QTD_AREAS = LIMITES.length;
    
    // QUESTÃO 3
    public static void main(String[] args)
    {
        int[][] notas = new int[QTD_CANDIDATOS][QTD_AREAS];
        int op = 0;

        while (op != 9) {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                "Selecione a opção desejada:\n\n1 - Carregar matriz\n2 - Mostrar Estatisticas\n9 - Sair"
            ));
            if (op == 1) {
                carregarMatriz(notas);
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
    private static void carregarMatriz(int[][] matriz)
    {
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
                        return;
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
    }

    // QUESTÃO 2
    private static void mostrarEstatisticas(int[][] notas)
    {
        int[] notaFinal = new int[QTD_CANDIDATOS];
        int[] notaAprovados = new int[QTD_CANDIDATOS];
        float media;
        int aux, pos, total, qtdAprovados;
        int notaMostrada = 1;

        total = 0;
        for(int c = 0; c < QTD_CANDIDATOS; c++) {
            for (int a = 0; a < QTD_AREAS; a++) {
                notaFinal[c] += notas[c][a];
                if (a != 2 && notas[c][a] < (LIMITES[a] / 2)) {
                    notaAprovados[c] = 0;
                    break;
                }
                notaAprovados[c] += notas[c][a];
            }
        }

        qtdAprovados = 0;
        System.out.println("---------- Notas dos candidatos aprovados ----------");
        for (int c = 0; c < QTD_CANDIDATOS; c++) {
            if (notaAprovados[c] > 0) {
                System.out.printf("Nota do candidatos %6d: %3d\n", c, notaAprovados[c]);
                qtdAprovados += 1;
                total += notaAprovados[c];
            }
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

        // 50 maiores notas diferentes
        //System.out.println(Arrays.toString(notaFinal));
        System.out.println("---------- 50 maiores notas diferntes ----------");
        pos = 0;
        while (pos < QTD_CANDIDATOS && notaMostrada <= 50) {
            aux = notaFinal[pos];
            System.out.println(notaMostrada + "a maior nota = " + aux);
            notaMostrada++;
            while (pos < QTD_CANDIDATOS && notaFinal[pos] == aux)
                pos++;
        }

        media = total / (float)qtdAprovados;
        System.out.println("Média: " + media);
        for (int c = 0; c < QTD_CANDIDATOS; c++) {
            if (notaAprovados[c] > media)
                System.out.printf("O candidato %6d está acima da média com nota %3d\n", c, notaAprovados[c]);
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
