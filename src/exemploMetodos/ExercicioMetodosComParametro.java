package exemploMetodos;

public class ExercicioMetodosComParametro {
    public static void main(String[] args) {
       System.out.println(exibirModeloEAnoCarro(2022, "Nivus")); 
       System.out.println(retornarCarro("Nivus")); 
        System.out.println(retornarMetade(600)); 
        System.out.println(retornarCarroEMoto("Carro","Moto"));
        System.out.println(retornarPrecoVeiculo(60000.00));
        
        exibirModeloEAnoCarroSemRetorno(2022, "Nivus"); 
        retornarCarroSemRetorno("Nivus"); 
        retornarMetadeSemRetorno(600);
        retornarCarroEMotoSemRetorno("Carro","Moto");
        retornarPrecoVeiculoSemRetorno(60000.00);
    }
    
public static String exibirModeloEAnoCarro (int ano, String modelo){
    return "Modelo" +modelo + " Ano"+ ano;
}
public static String retornarCarro (String carro){
    return "Carro" +carro;
}
public static int retornarMetade (int preco){
    return preco/2;
}
public static String retornarCarroEMoto (String carro, String moto){
    return  carro+ " "+ moto;
}public static double retornarPrecoVeiculo (double d){
    return 60000.00;
}

public static void exibirModeloEAnoCarroSemRetorno (int ano, String modelo){
    System.out.println("Modelo" +modelo + " Ano"+ ano);
   
}
public static void retornarCarroSemRetorno (String carro){
    System.out.println("Carro" +carro);
    
}
public static void retornarMetadeSemRetorno (int preco){
    System.out.println(preco/2); 
}
public static void retornarCarroEMotoSemRetorno (String carro, String moto){
    System.out.println(carro+ " "+ moto);  
}
public static void retornarPrecoVeiculoSemRetorno (double d){
    System.out.println(60000.00);
}

}
