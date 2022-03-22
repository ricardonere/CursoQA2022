package easy;

import javax.swing.JOptionPane;

public class Exercicio9 {
    public static void main(String[] args) {
    int numeroDigitado,  i = 1; 

	 numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
	
	while (i<=10) {
        System.out.println (numeroDigitado * i); 
        i=i+1; 
        // Declarar variável do tipo numérico: numeroDigitado,  i = 1; 

        // numeroDigitado = Ler(“5”); 
        
        // Enquanto(i<=10)
        //    Exibir: numeroDigitado * i; 
        //    i=i+1; 
        // Fim Enquanto
    
    }

	






    }
    
}
