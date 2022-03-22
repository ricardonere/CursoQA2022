package medium;

import javax.swing.JOptionPane;

public class Exercicio07_medium {
   
    public static void main(String[] args) {
        
         
        String vetorMeses[] = new String[12];
        vetorMeses[0] = JOptionPane.showInputDialog("Digite o mes");
        vetorMeses[1] = JOptionPane.showInputDialog("Digite o mes");
        vetorMeses[2] = JOptionPane.showInputDialog("Digite o mes");
        vetorMeses[3] = JOptionPane.showInputDialog("Digite o mes");
        vetorMeses [4] = JOptionPane.showInputDialog("Digite o mes");
        vetorMeses [5] = JOptionPane.showInputDialog("Digite o mes");
        vetorMeses[6 ] = JOptionPane.showInputDialog("Digite o mes");
        vetorMeses [7 ] = JOptionPane.showInputDialog("Digite o mes");
        vetorMeses[8] = JOptionPane.showInputDialog("Digite o mes");
        vetorMeses[9] = JOptionPane.showInputDialog("Digite o mes");
        vetorMeses[10] = JOptionPane.showInputDialog("Digite o mes");
        vetorMeses[11] = JOptionPane.showInputDialog("Digite o mes");
        
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
