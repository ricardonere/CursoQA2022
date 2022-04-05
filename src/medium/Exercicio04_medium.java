package medium;

public class Exercicio04_medium {

    public int [] multiplicarAteMil() {

        int i = 1, resultadoMultiplicacao = 1;
        int [] vetorMultiplicaNumeros = new int [1001];
        while (i <= 1000) {
            resultadoMultiplicacao = resultadoMultiplicacao * i;
            vetorMultiplicaNumeros [i] = resultadoMultiplicacao;
            i++;
            if (resultadoMultiplicacao > 1000) {
                resultadoMultiplicacao = 1;
            }
            i++;
        } // fim while
        return vetorMultiplicaNumeros;

    }// fim main
}// fim classe
// Fazer e retornar com vetor
// public int [] somaNumerosAteMil () {

//     int i = 0;
//     int soma = 0;
//     int [] vetorSomaNumeros = new int [1001];

//     while (i <= 1000) {
//         soma = soma + i;
//         vetorSomaNumeros [i] = soma;
//         i++;
//         if (soma >= 1500) {
            
//             break;// Serve para finalizar o enquanto.
            
//         }
//     }//enquanto
//     return vetorSomaNumeros;
