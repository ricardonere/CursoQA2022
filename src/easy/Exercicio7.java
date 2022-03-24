package easy;

import javax.swing.JOptionPane;

public class Exercicio7 {
    public String calculoSalario(double salario, double inss) {

        salario = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do seu salario"));

        if (salario <= 1045.00) {

            inss = (int) (salario * 0.075);
            return ("O Valor que você de inss será: " + inss);
        }
        if (salario >= 1045.01 && salario <= 2089.60) {
            inss = (int) (salario * 0.09);
            return (" O valor de inss será: " + inss);
        }
        if (salario >= 2089.61 && salario <= 3134.40) {

            inss = (int) (salario * 0.12);
            return ("O valor de Inss será: " + inss);
        }
        if (salario >= 3134.41 && salario <= 6101.06) {

            inss = (int) (salario * 0.14);
            return ("O Valor que você de inss será: " + inss);
        }
        if (salario >= 6101.07) {

            inss = (int) 854.15;
            return ("O Valor que você de inss será: " + inss);
        }
        return null;
    }

}
