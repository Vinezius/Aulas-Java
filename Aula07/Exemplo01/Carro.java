package Aula07.Exemplo01;

public class Carro extends Veiculo {

    private Integer numeroPortas;
	
	public Carro(String modelo, String fabricante, Integer ano, Integer numeroPassageiros, String combustivel, Integer numeroPortas) {
		
		super(modelo, fabricante, ano, numeroPassageiros, combustivel);
		this.numeroPortas = numeroPortas;
	}

	public void calibrarPneus() {
		
		System.out.println("Calibrando os pneus do veículo " + super.modelo);
	}

}
