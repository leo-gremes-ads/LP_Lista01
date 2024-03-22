package ex30;

import javax.swing.JOptionPane;

public class Ex30
{
    public static void main(String[] args)
    {
        int dn, mn, an, da, ma, aa, dt, mt, at;
        
        //ENTRADA DATA DE NASCIMENTO
        while (true) {
            dn = coletaDia("Informe o dia de nascimento");
            mn = coletaMes("Informe o mês de nascimento");
            an = inteiroValido("Informe o ano de nascimento");
            if (dn <= diasNoMes(mn, an)) break;
            JOptionPane.showMessageDialog(null, "Data inválida! Digite novamente");
        }
        //ENTRADA DATA ATUAL
        while (true) {
            da = coletaDia("Informe o dia atual");
            ma = coletaMes("Informe o mês atual");
            aa = inteiroValido("Informe o ano atual");
            if (da <= diasNoMes(ma, aa)) break;
            JOptionPane.showMessageDialog(null, "Data inválida! Digite novamente");
        }
        //CALCULO DA DIFERENCA
        //ANO
        at = aa - an;
        if (at < 0)
            fecharPrograma("Data de nascimento posterior a atual!");
        //MES
        mt = ma - mn;
        if (at == 0 && mt < 0)
            fecharPrograma("Data de nascimento posterior a atual!");
        if (mt < 0) {
            mt += 12;
            at--;
        }
        //DIA
        dt = da - dn;
        if (at == 0 && mt == 0 && dt < 0)
            fecharPrograma("Data de nascimento posterior a atual");
        if (dt < 0) {
            mt--;
            if(mt < 0) {
                mt += 12;
                at--;
            }
            if (ma == mn)
                dt += diasNoMes(ma, aa);
            else if (ma == 1)
                dt += 31;
            else
                dt += diasNoMes(ma - 1, aa);
        }
        JOptionPane.showMessageDialog(null, 
                "Vivo por " + at + " anos, " + mt + " meses e " + dt + " dias!");
    }
    
    private static void fecharPrograma(String msg)
    {
        JOptionPane.showMessageDialog(null, msg);
        System.exit(0);
    }
    
    private static int coletaDia(String msg)
    {
        int dia;
        
        while (true) {
            dia = inteiroValido(msg);
            if (dia >=0 && dia <= 31) break;
            JOptionPane.showMessageDialog(null, "Dia inválido! Digite novamente");
        }
        return dia;
    }
    
    private static int coletaMes(String msg)
    {
        int mes;
        
        while (true) {
            mes = inteiroValido(msg);
            if (mes >= 0 && mes <= 12) break;
            JOptionPane.showMessageDialog(null,"Mês inválido! Digite novamente");
        }
        return mes;
    }
    
    private static int diasNoMes(int mes, int ano)
    {
        switch(mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                if (anoBissexto(ano))
                    return 29;
                return 28;
        }
    }
    
    private static boolean anoBissexto(int ano)
    {
        return ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0));
    }
    
    private static int inteiroValido(String msg)
    {
        String txt;
        int n;
        
        while (true) {
            txt = JOptionPane.showInputDialog(msg);
            try {
                n = Integer.parseInt(txt);
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida!");
            }
        }
        return n;
    }
}