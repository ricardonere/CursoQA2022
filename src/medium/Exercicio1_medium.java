package medium;

public class Exercicio1_medium {
    public static void main(String[] args) {
        int i = 0;

        while (i <= 100) {

            if (i % 2 == 0) {//% => MOD
                System.out.println("O numero: " + i + " É par!");
            } else {
                System.out.println("O numero: " + i + " É ímpar!");
            }
         i++;
        } // fim while
    }// fim main
}// fim da classe
