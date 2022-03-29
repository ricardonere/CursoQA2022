package medium;

public class Exercicio10_medium {
    public String[] calculaFibonacciStrings() {

        int[] vetorFibonacci = new int[10];
        int i = 2;
        vetorFibonacci[0] = 0;
        vetorFibonacci[1] = 1;

        while (i <= 9) {
            vetorFibonacci[i] = vetorFibonacci[i - 1] + vetorFibonacci[i - 2];
            i++;
        }
        i = 0;
        while (i <= 9) {
            System.out.println(vetorFibonacci[i]);
            i++;
        }
        return null;

        // Declarar vetor tipo inteiro: vetorFibonacci[10];
        // Declarar variável do tipo inteiro: i = 2;
        // vetorFibonacci[0] = 0;
        // vetorFibonacci[1] = 1;

        // Enquanto(i<=9)
        // vetorFibonacci[i] = vetorFibonacci[i-1] + vetorFibonacci[i-2];
        // i++;
        // Fim Enquanto
        // i=0;

        // Enquanto(i<=9)
        // Exibir: vetorFibonacci[i];
        // i++;

    }
}
