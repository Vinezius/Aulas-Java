package Aula08.exemploimoveis;

public class ImovelUsado extends Imovel {
    private Double valorDesconto;
	
	public ImovelUsado(String endereco, Double valorBase, Double valorDesconto) {
		
		super(endereco, valorBase);
		this.valorDesconto = valorDesconto;
	}
		
	public void imprimirDados() {
		
		System.out.println("\n========= IMÓVEL USADO =========");
		super.imprimirDados();
		System.out.println("Valor Desconto: R$" + this.valorDesconto);
	}
}
