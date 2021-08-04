package Aula06;

public class ContratoAluguelTeste {
    public static void main(String[] args) {
		
		// declaração + instanciação
		Carro c1 = new Carro("Cruze", "Chevrolet", 2020);
		
		// declaração
		Carro c2;		
		// instanciação
		c2 = new Carro("Gol", "Volks", 2018);
		
		ContratoAluguel ca1 = new ContratoAluguel(1111, "João da Silva", c2);
		System.out.println(ca1);
		
		ContratoAluguel ca2 = new ContratoAluguel(2222, "Maria de Oliveira");
		System.out.println(ca2);
		
		ca2.atribuirCarro(c1);
		System.out.println(ca2);
	}
}
