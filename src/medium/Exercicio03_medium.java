package medium;

public class Exercicio03_medium {

    public int [] somaNumerosAteMil () {

        int i = 0;
        int soma = 0;
        int [] vetorSomaNumeros = new int [1001];

        while (i <= 1000) {
            soma = soma + i;
            vetorSomaNumeros [i] = soma;
            i++;
            if (soma >= 1500) {
                
                break;// Serve para finalizar o enquanto.
                
            }
        }//enquanto
        return vetorSomaNumeros;

    }// fecha main

}// fecha classe
// Fazer e retornar com vetor