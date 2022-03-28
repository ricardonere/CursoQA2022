package medium;

import javax.swing.JOptionPane;

public class Exercicio02_medium {

    public double valorInvestidoJurosCompostos (double valorInvestimento) {

        double taxaJuros = 0.05; double totalAtualizadoComJuros;
        int ano = 1, tempoInvestido = 10;
        // String valorInvestimentoStg =  JOptionPane.showInputDialog("Digite um valor de investimento: ");
        // valorInvestimento = Integer.parseInt(valorInvestimentoStg);
        totalAtualizadoComJuros = valorInvestimento;

        while (ano <= tempoInvestido) {
            totalAtualizadoComJuros = (totalAtualizadoComJuros * taxaJuros) + totalAtualizadoComJuros;
            ano++;
        } // fim while
    //    return("O valor do investimento são: " + valorInvestimento);
    //     System.out.println("O valor do Juros são: " + (totalAtualizadoComJuros - valorInvestimento));

        return totalAtualizadoComJuros-valorInvestimento;
        // return tempoInvestido;
    }// fim main
    public double calcularValorInvestido(double valorInvestimento, double valorJuros){
        return valorInvestimento + valorJuros;
    }
}// fim da classe
