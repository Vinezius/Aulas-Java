package Aula07.Exemplo01;

public class Aviao extends Veiculo {
    
	private Integer altitudeMaxima;
	
	public Aviao(String modelo, String fabricante, Integer ano, Integer numeroPassageiros, String combustivel, Integer altitudeMaxima) {
		
		super(modelo, fabricante, ano, numeroPassageiros, combustivel);
		this.altitudeMaxima = altitudeMaxima;
	}

	public void voar() {
		
		System.out.println("O avião " + super.modelo + " está voando.");
	}
}
