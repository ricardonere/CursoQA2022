package medium;

import javax.swing.JOptionPane;

public class Exercicio02_medium {

    public static void main(String[] args) {

        double valorInvestimento, taxaJuros = 0.05, totalAtualizadoComJuros;
        int ano = 1, tempoInvestido = 10;
        String valorInvestimentoStg =  JOptionPane.showInputDialog("Digite um valor de investimento: ");
        valorInvestimento = Integer.parseInt(valorInvestimentoStg);
        totalAtualizadoComJuros = valorInvestimento;

        while (ano <= tempoInvestido) {
            totalAtualizadoComJuros = (totalAtualizadoComJuros * taxaJuros) + totalAtualizadoComJuros;
            ano++;
        } // fim while
        System.out.println("O valor do investimento são: " 
        + valorInvestimento);
        System.out.println("O valor do Juros são: " + (totalAtualizadoComJuros - valorInvestimento));

        System.out.println("O valor total do investimento: "+totalAtualizadoComJuros);


    }// fim main
}// fim da classe
