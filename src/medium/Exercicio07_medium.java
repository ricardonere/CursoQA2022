package medium;

import javax.swing.JOptionPane;

public class Exercicio07_medium {
   
    public String[] exibirVetores() {
         String vetorMeses[] = new String[12];

        vetorMeses[0] = JOptionPane.showInputDialog("Janeiro");
        vetorMeses[1] = JOptionPane.showInputDialog("Fevereiro");
        vetorMeses[2] = JOptionPane.showInputDialog("Março");
        vetorMeses[3] = JOptionPane.showInputDialog("Abril");
        vetorMeses [4] = JOptionPane.showInputDialog("Maio");
        vetorMeses [5] = JOptionPane.showInputDialog("Junho");
        vetorMeses[6 ] = JOptionPane.showInputDialog("Julho");
        vetorMeses [7 ] = JOptionPane.showInputDialog("Agosto");
        vetorMeses[8] = JOptionPane.showInputDialog("Setembro");
        vetorMeses[9] = JOptionPane.showInputDialog("Outubro");
        vetorMeses[10] = JOptionPane.showInputDialog("Novembro");
        vetorMeses[11] = JOptionPane.showInputDialog("Dezembro");
        
        return vetorMeses;
    }
       public void inprimeValorVetor (String [] vetorMeses){
        int i=0;
        while (i<=11){
            System.out.println(vetorMeses[i]);
            i++;
            
        }
//         Declarar variavel do inteiro: i=0;
// Enquanto(i<=11)
//         	Exibir: vetorMeses[i];
//         	i++;  
        

    
        
        

    }
}
