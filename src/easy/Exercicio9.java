package easy;

public class Exercicio9 {
    public int[] calculaNumeroDigitado(int numeroDigitado) {
        int i = 1, resultado;
        int[] vetorTabuada = new int[10];

        while (i <= 10) {
            vetorTabuada[i-1] = numeroDigitado * i;
            i++;

        }
        return vetorTabuada;

    }
    public void exibeVetor(int []vetorTabuada) {
        int i = 0;

        while (i < 10) {
             System.out.println( vetorTabuada[i]);
            
            i++;

        }
        

    }
    

}
