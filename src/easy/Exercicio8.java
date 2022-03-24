package easy;

import javax.swing.JOptionPane;

public class Exercicio8 {
    public String calculoSalario(double salario, double ir ) { 
       

        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu salario"));

        if (salario > 0 && salario <= 1903.98) {

            return("Isento de imposto de renda");
        }

        if (salario >= 1903.99 && salario <= 2826.65) {

            ir = ((salario * 0.075) - 142.80);
            return ("O valor do IR será"+ir);
        }

        if (salario >= 2826.66 && salario <= 3751.05) {

            ir = ((salario * 0.15) - 354.80);
            return ("O valor do IR será"+ir);
        }

        if (salario >= 3751.06 && salario <= 4664.68) {

            ir = ((salario * 0.225) - 636.13);
            return ("O valor do IR será"+ir);
        }

        if (salario > 4664.68) {

            ir = ((salario * 0.275) - 869.36);
            return ("O valor do IR será"+ir);
        }
        return null;

    

    }

}

