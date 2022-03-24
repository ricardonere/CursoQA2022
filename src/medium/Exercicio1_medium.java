package medium;

public class Exercicio1_medium {
    public String numeroDigitado(int i) {
        

        while (i <= 100) {

            if (i % 2 == 0) {//% => MOD
                return("O numero: " + i + " É par!");
            } else {
                return("O numero: " + i + " É ímpar!");
            }
        } // fim while
        return null;
    }// fim main
}// fim da classe
