package medium;

import javax.swing.JOptionPane;

public class Exercicio06_medium {

    public int exibirFatorial(int fatorial) {
        int i;
        
        i = fatorial;
        while (i > 1) {// até i = 2
            System.out.println("Fatorial = "+ fatorial +" X "+ (i - 1) + " = " +(fatorial * (i - 1)));
            fatorial = fatorial * (i - 1);
            i--;
        } // fecha while
       //System.out.println("O fatorial do número digitado é " + fatorial);
        return fatorial;
    }// fecha main
}// fecha classe
