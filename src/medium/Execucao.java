package medium;

import javax.swing.JOptionPane;

public class Execucao {
    public static void main(String[] args) {
        String valorInvestimentoStg =  JOptionPane.showInputDialog("Digite um valor de investimento: ");
    double valorInvestimento = Double.parseDouble(valorInvestimentoStg);
Exercicio02_medium exercicio02_medium = new Exercicio02_medium();
double valorJuros = exercicio02_medium.valorInvestidoJurosCompostos(valorInvestimento);
double valorTotal = exercicio02_medium.calcularValorInvestido(valorInvestimento, valorJuros);
System.out.println("Você investiu" +valorInvestimento);
System.out.println("O valor dos juros são de" +valorJuros);
System.out.println("O valor total são:" +valorTotal);

    }
}
