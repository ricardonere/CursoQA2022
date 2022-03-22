package easy;



import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {
        int nota1, nota2;
        int media;
       
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota"));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota"));

media = (nota1+nota2) /2;


if (media > 5) {
     System.out.println( "Aprovado" +media); 
}

if (media < 5){
System.out.println( "Reprovado" +media); 
}

    if (media == 5){

    System.out.println( "Exame" +media); 
}
    




    }
}
