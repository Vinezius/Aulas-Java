package Aula07.Exemplo01;

public class Veiculo {
    
	protected String modelo;
	protected String fabricante;
	protected Integer ano;
	protected Integer numeroPassageiros;
	protected String combustivel;
	
	public Veiculo(String modelo, String fabricante, Integer ano, Integer numeroPassageiros, String combustivel) {
		
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.ano = ano;
		this.numeroPassageiros = numeroPassageiros;
		this.combustivel = combustivel;
	}
	
	public void abastecer() {
		
		System.out.println("Abastecendo o veículo " + this.modelo);
	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", fabricante=" + fabricante + ", ano=" + ano + ", numeroPassageiros="
				+ numeroPassageiros + ", combustivel=" + combustivel + "]";
	}
}
