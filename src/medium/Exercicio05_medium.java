package medium;

public class Exercicio05_medium {

    public int verificarMenorNumero(int []vetorNumeros) {//assinatura(parametro entre parenteses)
        int numeroDigitado;//variável
        int menorNumero = 0, i = 1;//variável
       

        while (i <= 5) {//enquanto
            numeroDigitado = vetorNumeros [i-1];//calcula e atribui o resultado a variavel
             
            if (numeroDigitado < menorNumero || i == 1) {//se
                menorNumero = numeroDigitado;//
            }
            i++;//icremento
        }
        return menorNumero;//retorno
    }

    
}//Remover joptonpane e receber por parâmetro
