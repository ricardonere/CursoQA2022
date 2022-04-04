package medium;

import javax.swing.JOptionPane;

public class Exercicio05_medium {

    public int validarNumeroDigitado() {
        int numeroDigitado;
        int menorNumero = 0, i = 1;
        String numeroDigitadoString;

        while (i <= 5) {
            numeroDigitado = lerNumeroDigitado();
             
            if (numeroDigitado < menorNumero || i == 1) {
                menorNumero = numeroDigitado;
            }
            i++;
        }
        System.out.println("O número: " + menorNumero + " é o menor.");
        return menorNumero;
    }

    private int lerNumeroDigitado() {
        String numeroDigitadoString = JOptionPane.showInputDialog("Digite um numero");
        int numeroDigitado = Integer.parseInt(numeroDigitadoString);
        return numeroDigitado;
    }
}//Remover joptonpane e receber por parâmetro
