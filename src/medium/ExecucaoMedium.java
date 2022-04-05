package medium;

public class ExecucaoMedium {
    public static void main(String[] args) {
        Exercicio03_medium exercicio03_medium = new Exercicio03_medium();
        exercicio03_medium.somaNumerosAteMil();
        exibeVetor(exercicio03_medium.somaNumerosAteMil());
    }

    public static void exibeVetor(String[] vetorImprime) {
        int i = 0;

        while (i < vetorImprime.length) {
            System.out.println(vetorImprime[i]);

            i++;

        }

    }
    public static void exibeVetor(int[] vetorImprime) {
        int i = 0;

        while (i < vetorImprime.length) {
            System.out.println(vetorImprime[i]);

            i++;

        }

    }
// }
// public class ExecucaoMedium {
//     public static void main(String[] args) {
//         Exercicio04_medium exercicio04_medium = new Exercicio04_medium();
//         exercicio04_medium.multiplicarAteMil();
//         exibeVetor(exercicio04_medium.multiplicarAteMil());
//     }

//     public static void exibeVetor(String[] vetorImprime) {
//         int i = 0;

//         while (i < vetorImprime.length) {
//             System.out.println(vetorImprime[i]);

//             i++;

//         }

//     }
//     public static void exibeVetor(int[] vetorImprime) {
//         int i = 0;

//         while (i < vetorImprime.length) {
//             System.out.println(vetorImprime[i]);

//             i++;

//         }

//     }
}