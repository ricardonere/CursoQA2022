package exerciciosInstanciaDeClasse;

public class ExecucaoE {
    public static void main(String[] args) {
        Elevador objElevador = new Elevador();
        System.out.println(objElevador.modeloElevador);
        System.out.println(objElevador.capacidadePessoas);

        objElevador.subir();
        objElevador.parar();
        objElevador.exibir();
    }
}
