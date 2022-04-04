package medium;

public class Execucao01medium {
    public static void main(String[] args) {
        Exercicio1_medium exercicio1_medium = new Exercicio1_medium();
        exercicio1_medium.numeroDigitado();

        exibeVetor(exercicio1_medium.numeroDigitado());

    }

    public static void exibeVetor(String[] vetorTabuada) {
        int i = 0;

        while (i < 101) {
            System.out.println(vetorTabuada[i]);

            i++;

        }

    }
}
