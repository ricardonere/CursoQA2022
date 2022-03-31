package easy;

import javax.swing.JOptionPane;

public class Exercicio10 {
    public String valorInvestido(double valorInvestimento, double taxaJuros , double valorJuros, double valorTotal) {
       
        valorInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor investido"));
        taxaJuros = 0.05 * 10; //0.50 ou 50%
        valorJuros = valorInvestimento * taxaJuros; // 500,00. valorTotal = valorTotal = valorJuros+valorInvestimento
        valorTotal = valorJuros+valorInvestimento;

        return("Você investiu: "+valorInvestimento+" - Rendeu: "+valorJuros + " de Juros."+" O Valor total são: "+ valorTotal);
        
        



    }
}
