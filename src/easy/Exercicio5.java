package easy;

import javax.swing.JOptionPane;

public class Exercicio5 {

    // int numero1, numero2, numero3;
    // int soma, subtraçao, multiplicaçao, media;

    // numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
    // numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
    // numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

    // soma = numero1 + numero2 + numero3;
    // subtraçao = numero1 - numero2 - numero3;
    // multiplicaçao = numero1 * numero2 * numero3;
    // media = soma / 3;

    // System.out.println( "A soma dos números digitados é: " +soma);
    // System.out.println( "A subtração dos números digitados é:" +subtraçao);
    // System.out.println( "A multiplicaçao dos números digitados é:"
    // +multiplicaçao);
    // System.out.println( "A media dos números digitados é:" +media);

    public int calcularSoma(int numero1, int numero2, int numero3) {
        int soma = numero1 + numero2 + numero3;
        return soma;
    }
    public int calcularSubtracao(int numero1, int numero2, int numero3) {
        int subtracao = numero1 - numero2 - numero3;
        return subtracao;
}
public int calcularMultiplicacao(int numero1, int numero2, int numero3) {
    int multiplicacao = numero1 * numero2 * numero3;
    return multiplicacao;
}
public int calcularMedia(int numero1, int numero2, int numero3) {
    int media = numero1 + numero2 + numero3 /3;
    return media;
}
}