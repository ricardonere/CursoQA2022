package medium;

public class Exercicio04_medium {

    public int [] multiplicarAteMil() {//assinatura

        int i = 1, resultadoMultiplicacao = 1;//variaveis
        int [] vetorMultiplicaNumeros = new int [1001];//instanciar(criar vetor)
        while (i <= 1000) {//enquanto
            resultadoMultiplicacao = resultadoMultiplicacao * i;//multiplicacao e atribuicao
            vetorMultiplicaNumeros [i] = resultadoMultiplicacao;//atribui resultadoMulti ao vetor na posicao i
            
            if (resultadoMultiplicacao > 1000) {//verificando se resultado da multi é maior que 1000
                resultadoMultiplicacao = 1;//atribuição 1 para variavel resultadoMulti
                vetorMultiplicaNumeros [i] = resultadoMultiplicacao;//atribui resultadoMulti ao vetor na posicao i
            }
            i++;//icremento
        } // fim while
        return vetorMultiplicaNumeros;//retorna vetorMultiplicaNumeros

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
