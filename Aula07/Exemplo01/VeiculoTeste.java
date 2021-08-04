package Aula07.Exemplo01;

public class VeiculoTeste {
    
	public static void main(String[] args) {
		
		Carro c1 = new Carro("Gol", "Volks", 2021, 5, "Flex", 5);
		c1.calibrarPneus();
		c1.abastecer();
		
		Aviao a1 = new Aviao("A380-800", "Airbus", 2000, 200, "Combustivel de aviação", 35000);
		a1.voar();
		a1.abastecer();
		
		Veiculo v1 = new Veiculo("Cruze", "Chevrolet", 2018, 5, "Flex");
		v1.abastecer();
	}
}
