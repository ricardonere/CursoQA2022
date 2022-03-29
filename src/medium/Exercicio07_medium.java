package medium;

import javax.swing.JOptionPane;

public class Exercicio07_medium {
   
    public String[] exibirVetores() {
         String vetorMeses[] = new String[12];

        vetorMeses[0] = ("Janeiro");
        vetorMeses[1] = ("Fevereiro");
        vetorMeses[2] = ("Março");
        vetorMeses[3] = ("Abril");
        vetorMeses [4] = ("Maio");
        vetorMeses [5] = ("Junho");
        vetorMeses[6 ] = ("Julho");
        vetorMeses [7 ] = ("Agosto");
        vetorMeses[8] = ("Setembro");
        vetorMeses[9] = ("Outubro");
        vetorMeses[10] = ("Novembro");
        vetorMeses[11] = ("Dezembro");
        
        return vetorMeses;
    }
       void inprimeValorVetor (String [] vetorMeses){
        int i=0;
        while (i<12){
            System.out.println("O mês" +(i+1)+"-" +vetorMeses[i]);
            i++;
            
        }
//         Declarar variavel do inteiro: i=0;
// Enquanto(i<=11)
//         	Exibir: vetorMeses[i];
//         	i++;  
        

    
        
        

    }
}
