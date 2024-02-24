import javax.swing.JOptionPane;

/*
Receba os valores do comprimento, largura e altura de um paralelepípedo.
Calcule e mostre seu volume.
*/

public class LT01_EstSeq07
{
    public static void main(String args[])
    {
        int comp, larg, alt, vol;
        comp = Integer.parseInt(JOptionPane.showInputDialog("Informe o comprimento:"));
        larg = Integer.parseInt(JOptionPane.showInputDialog("Informe a largura:"));
        alt = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura:"));
        vol  = comp * larg * alt;
        JOptionPane.showMessageDialog(null, "O volume é " + vol);
    }
}
