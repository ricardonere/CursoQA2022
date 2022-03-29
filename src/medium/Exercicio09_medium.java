package medium;

import javax.swing.JOptionPane;

import exemploMetodos.sysout;

public class Exercicio09_medium {
    public void exibeNomeNumeros()  {
       
        String vetorAlunos[] = new String[5];
        int vetorNumeroAlunos[] = new int[5];
        int i =0;

        while (i<5){
        vetorAlunos[i] = recebeNomeAluno();
        vetorNumeroAlunos[i] = recebeNumeroAluno();
        i++;
    }
    
imprimeNomeNumero(vetorAlunos,vetorNumeroAlunos);
    
    }

    private void imprimeNomeNumero(String[] vetorAlunos, int[] vetorNumeroAlunos) {
        int i=0;  

        while (i < 5){
            System.out.println("O nome do aluno é"  +  vetorAlunos[i] +"-"+ "O numero do aluno é"  +  vetorNumeroAlunos[i]);
            i++;
        }

    }
    private int recebeNumeroAluno() {
        return Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do aluno"));
    }

    private String recebeNomeAluno() {
        return JOptionPane.showInputDialog("Digite o nome do aluno");
    }

    
}

// Enquanto(i<=4)
// vetorAlunos[i] = Ler();
// vetorNumeroAlunos[i] = Ler();
// i++;
// Fim Enquanto

// i=0; //Reset do valor da variável

// Enquanto(i<=4)
// Exibir: vetorAlunos[i];
// Exibir: vetorNumeroAlunos[i];
// i++;


