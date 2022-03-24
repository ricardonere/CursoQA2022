package easy;

import javax.swing.JOptionPane;

public class Exercicio9 {
    public int numeroDigitado (int numeroDigitado,  int i ) {
   

	 numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
	
	while (i<=10) {
       return (numeroDigitado * i);

        // numeroDigitado = Ler(“5”); 
        
        // Enquanto(i<=10)
        //    Exibir: numeroDigitado * i; 
        //    i=i+1; 
        // Fim Enquanto
    
    }
    return (Integer) null;

	






    }
    
}
