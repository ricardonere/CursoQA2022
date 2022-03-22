package medium;

import javax.swing.JOptionPane;

public class Exercicio05_medium {

    public static void main(String[] args) {

        int numeroDigitado, menorNumero = 0, i = 1;
        String numeroDigitadoString;

        while (i <= 5) {
            numeroDigitadoString = JOptionPane.showInputDialog("Digite um numero");
            numeroDigitado = Integer.parseInt(numeroDigitadoString); 
            if (numeroDigitado < menorNumero || i == 1) {
                menorNumero = numeroDigitado;
            }
            i++;
        }
        System.out.println("O número: " + menorNumero + " é o menor.");
    }
}
