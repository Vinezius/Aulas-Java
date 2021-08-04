package Aula06;

public class Carro {
    private String modelo;
	private String marca;
	private Integer ano;
	
	public Carro(String modelo, String marca, Integer ano) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + "]";
	}
}
