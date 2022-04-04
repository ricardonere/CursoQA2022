package medium;

public class Exercicio1_medium {
    public String [] numeroDigitado() {
        int i = 0;
        String [] vetorParImpar = new String [101];

        while (i <= 100) {

            if (i % 2 == 0) {//% => MOD
                vetorParImpar [i]= "O numero: " + i + " É par!";
            } else {
               vetorParImpar [i]= "O numero: " + i + " É ímpar!";

            }
            i++;
        } // fim while
        return vetorParImpar;

    }// fim main
}// fim da classe
// Fazer e retornar com vetor