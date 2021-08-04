package Aula06;

public class ContratoAluguel {
    private Integer numeroContrato;
	private String nomeCliente;
	private Carro carro;
		
	public ContratoAluguel(Integer numeroContrato, String nomeCliente, Carro carro) {

		this.numeroContrato = numeroContrato;
		this.nomeCliente = nomeCliente;
		this.carro = carro;
	}
	
	public ContratoAluguel(Integer numeroContrato, String nomeCliente) {

		this.numeroContrato = numeroContrato;
		this.nomeCliente = nomeCliente;
	}
	
	public void atribuirCarro(Carro carro) {
		
		this.carro = carro;
	}

	@Override
	public String toString() {
		return "ContratoAluguel [numeroContrato=" + numeroContrato + ", nomeCliente=" + nomeCliente + ", carro=" + carro
				+ "]";
	}
}
