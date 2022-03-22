package medium;

import javax.swing.JOptionPane;

public class Exercicio09_medium {
    public static void main(String[] args) {
        
        String vetorAlunos[] = new String[5];
        String vetorNumeroAlunos[] = new String[5];
        int i=0;
        while (i<=4){
            vetorAlunos[i] = JOptionPane.showInputDialog("Digite o nome");
            vetorNumeroAlunos[i] = JOptionPane.showInputDialog("Digite o numero");
            i++; 
        }
        i=0;
        while (i<=4){
            System.out.println(vetorAlunos[i]);
            System.out.println(vetorNumeroAlunos[i]);
            i++;
        }
        // Declarar vetor do tipo texto: vetorAlunos[5];
        // Declarar vetor do tipo inteiro: vetorNumeroAlunos[5];
        // Declarar variável do tipo inteira: i=0;
         
        // Enquanto(i<=4)
        //             vetorAlunos[i] = Ler();
        // vetorNumeroAlunos[i] = Ler();
        // i++;
        // Fim Enquanto
         
        // i=0; //Reset do valor da variável
         
        // Enquanto(i<=4)
        //             Exibir: vetorAlunos[i];
        //             Exibir: vetorNumeroAlunos[i];
        //             i++;
        



    }
}
