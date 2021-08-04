package Aula08.exemploimoveis;

public class ImovelNovo extends Imovel {
    private Double valorAdicional;
	
	public ImovelNovo(String endereco, Double valorBase, Double valorAdicional) {
		
		super(endereco, valorBase);
		this.valorAdicional = valorAdicional;
	}

	public void imprimirDados() {
		
		System.out.println("\n========= IMÓVEL NOVO =========");
		super.imprimirDados();
		System.out.println("Valor Adicional: R$" + this.valorAdicional);
	}
}
