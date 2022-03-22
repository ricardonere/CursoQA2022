package exerciciosInstanciaDeClasse;

public class Execucao {
public static void main(String[] args) {
    Carro objCarro   = new Carro();

    System.out.println(objCarro.nomeCarro);
    System.out.println(objCarro.ano);

objCarro.correr();
objCarro.acelerar();
objCarro.frear();

}


    
}
