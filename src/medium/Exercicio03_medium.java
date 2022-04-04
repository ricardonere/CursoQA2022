package medium;

public class Exercicio03_medium {

    public void somaNumerosAteMil () {

        int i = 0, soma = 0;

        while (i <= 1000) {
            soma = soma + i;
            System.out.println(soma);
            i++;
            if (soma >= 1500) {
                break;// Serve para finalizar o enquanto.
            }
        }//enquanto

    }// fecha main

}// fecha classe
// Fazer e retornar com vetor