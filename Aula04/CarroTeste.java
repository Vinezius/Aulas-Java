package Aula04;

public class CarroTeste {
        public static void main(String[] args){
           
            // Instanciação dos objetos
            Carro carro1 = new Carro("458 Italia", "Ferrari", 2015,"AAA-1234","Vermelho");
            Carro carro2 = new Carro("Civic","Honda",2019,"MNO-9876","azul");
            Carro carro3 = new Carro("911 carrera", "Porsche", 2018,"XYZ-5555","Branco");
       
            // metódo de teste dos objetos
            carro1.ligar();
            carro1.acelerar(30);
            carro1.frear(20);


            // Verificação do estado atual dos objetos
            System.out.println(carro1);
            System.out.println(carro2);
            System.out.println(carro3);
       
        }
}

