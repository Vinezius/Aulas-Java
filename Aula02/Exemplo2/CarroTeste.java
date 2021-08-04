package Aula02.Exemplo2;

public class CarroTeste {
    
    public static void main(String[] args){

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        carro1.modelo = "458 Italia";
        carro1.marca = "Ferrari";
        carro1.ano = 2015;
        carro1.placa = "AAA-1234";
        carro1.cor = "vermelho";

        carro2.modelo = "Civic";
        carro2.marca = "Honda";
        carro2.ano = 2019;
        carro2.placa = "MNO-9876";
        carro2.cor = "azul";

        carro3.modelo = "911 carrera";
        carro3.marca = "Porsche";
        carro3.ano = 2018;
        carro3.placa = "XYZ-5555";
        carro3.cor = "Branco";

        System.out.println("CARRO1: ");
        System.out.println("modelo: "+ carro1.modelo);
        System.out.println("marca: "+ carro1.marca);
        System.out.println("ano: " +carro1.ano);
        System.out.println("Cor: "+ carro1.cor);
        
        System.out.println("================");

        System.out.println("CARRO2");
        System.out.println("modelo: "+carro2.modelo);
        System.out.println("marca: "+carro2.marca);
        System.out.println("ano: "+carro2.ano);
        System.out.println("Cor:"+ carro2.cor );

        System.out.println("================");
        
        System.out.println("CARRO3");
        System.out.println("modelo: "+carro3.modelo);
        System.out.println("marca: "+carro3.marca);
        System.out.println("ano: "+carro3.ano);
        System.out.println("Cor:"+ carro3.cor );
    }
}
