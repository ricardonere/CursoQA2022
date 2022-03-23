package easy;

import javax.swing.JOptionPane;

public class Exercicio6 {
    public String verificarAprovacao(int nota1, int nota2) {
        
        int media;

    
        media = (nota1 + nota2) / 2;

        if (media > 5) {
            return("Aprovado" + media);
        }

        if (media < 5) {
            return("Reprovado" + media);
        }

        if (media == 5) {

            return("Exame" + media);
        }
        return null;

    }
}
