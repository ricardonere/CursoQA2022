package easy;

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
int numero1, numero2, numero3; 
int soma, subtraçao, multiplicaçao, media; 

 numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
 numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
 numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

 soma = numero1 + numero2 + numero3; 
 subtraçao = numero1 - numero2 - numero3; 
 multiplicaçao = numero1 * numero2 * numero3;
 media = soma / 3; 


 System.out.println( "A soma dos números digitados é: " +soma); 
 System.out.println( "A subtração dos números digitados é:" +subtraçao); 
 System.out.println( "A multiplicaçao dos números digitados é:" +multiplicaçao); 
 System.out.println( "A media dos números digitados é:" +media); 

    }



}
