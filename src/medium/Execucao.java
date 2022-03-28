package medium;

import javax.swing.JOptionPane;

public class Execucao {
    public static void main(String[] args) {
        //Exercicio02
//         String valorInvestimentoStg =  JOptionPane.showInputDialog("Digite um valor de investimento: ");
//     double valorInvestimento = Double.parseDouble(valorInvestimentoStg);
// Exercicio02_medium exercicio02_medium = new Exercicio02_medium();
// double valorJuros = exercicio02_medium.valorInvestidoJurosCompostos(valorInvestimento);
// double valorTotal = exercicio02_medium.calcularValorInvestido(valorInvestimento, valorJuros);
// System.out.println("Você investiu" +valorInvestimento);
// System.out.println("O valor dos juros são de" +valorJuros);
// System.out.println("O valor total são:" +valorTotal);

//Exercicio03
// Exercicio03_medium exercicio03_medium = new Exercicio03_medium();
// exercicio03_medium.somaNumerosAteMil();

//Exercicio 04
// Exercicio04_medium exercicio04_medium = new Exercicio04_medium();
// exercicio04_medium.multiplicarAteMil();

//Exercicio05
// Exercicio05_medium exercicio05_medium =new Exercicio05_medium();
// int menorNumero = exercicio05_medium.validarNumeroDigitado();
// System.out.println("O número: " + menorNumero + " é o menor.");

//Exercicio 06
// String fatorialDigitadoString = JOptionPane.showInputDialog("Digite um número pra calcular o fatorial");
//        int fatorial = Integer.parseInt(fatorialDigitadoString);
// Exercicio06_medium exercicio06_medium = new Exercicio06_medium();
// fatorial = exercicio06_medium.exibirFatorial(fatorial);
// System.out.println(fatorial);

//Exercicio 07
Exercicio07_medium exercicio07_medium= new Exercicio07_medium();
String vetorMeses[] =exercicio07_medium.exibirVetores();
exercicio07_medium.inprimeValorVetor(vetorMeses);

    }
}
