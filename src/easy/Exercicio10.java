package easy;

import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        double valorInvestimento, taxaJuros = 0.05, valorJuros, valorTotal= 0.0;
        valorInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor investido"));
        taxaJuros = 0.05 * 10; //0.50 ou 50%
        valorJuros = valorInvestimento * taxaJuros; // 500,00. valorTotal = valorTotal = valorJuros+valorInvestimento
        valorTotal = valorJuros+valorInvestimento;

        System.out.println("Você investiu: "+valorInvestimento);
        System.out.println("Rendeu : "+valorJuros + "de Juros");
        System.out.println("O Valor total são : "+ valorTotal);
        



    }
}
