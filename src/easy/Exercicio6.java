package easy;

public class Exercicio6 {
    public String verificarAprovacao(double nota1, double nota2) {//linha de assinatura com dois parâmetros
        
        double media;

    
        media = (nota1 + nota2) / 2;//calculo e atribuição

        if (media > 5) {
            return("Aprovado - " + media);
        }

        if (media < 5) {
            return("Reprovado - " + media);
        }

        if (media == 5) {

            return("Exame - " + media);
        }
        return "Não foi possível calcular a media";

    }
}
