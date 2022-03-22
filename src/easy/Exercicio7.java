package easy;

import javax.swing.JOptionPane;

public class Exercicio7 {
    public static void main(String[] args) {
        int salario, inss;
        salario = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do seu salario"));

        if (salario <= 1045.00){
            
        inss = (int) (salario * 0.075);
        System.out.println("O Valor que você de inss será: " + inss);
        }
        if (salario >= 1045.01 && salario <= 2089.60) {
            inss = (int) (salario * 0.09);
            System.out.println(" O valor de inss será: " + inss);
        }
            if (salario >= 2089.61 && salario <= 3134.40){
                
            inss = (int) (salario * 0.12);
            System.out.println("O valor de Inss será: " + inss);
            }
            if (salario >= 3134.41 && salario <= 6101.06){
                
            inss = (int) (salario * 0.14);
            System.out.println("O Valor que você de inss será: " + inss);
            }
            if (salario >= 6101.07){
                
            inss = (int) 854.15;
            System.out.println("O Valor que você de inss será: " + inss);
            }
        }

    }

