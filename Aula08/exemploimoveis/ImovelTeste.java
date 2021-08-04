package Aula08.exemploimoveis;

import java.util.Scanner;

public class ImovelTeste {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Imovel imovel = null;

		System.out.println("Selecione o tipo de imóvel:");
		System.out.println("1 - Imóvel Novo");
		System.out.println("2 - Imóvel Usado");

		System.out.print("Opção: ");
		Integer opcao = input.nextInt();

		// UPCASTING
		System.out.println(">>> UPCASTING <<<");

		switch (opcao) {

			case 1: {
	
				imovel = new ImovelNovo("Vicente Machado, 1024", 500000.00, 250000.00);
				break;
			}
			case 2: {
	
				imovel = new ImovelUsado("Balduíno Taques, 512", 500000.00, 100000.00);
				break;
			}
			default: {
	
				System.out.println("Opção inválida.");
			}
		}

		imovel.imprimirDados();

		// DOWNCASTING
		System.out.println("\n>>> DOWNCASTING <<<");
		
		if (imovel instanceof ImovelNovo) {

			ImovelNovo testeImovelNovo = (ImovelNovo) imovel;
			testeImovelNovo.imprimirDados();

		} else if (imovel instanceof ImovelUsado) {

			ImovelUsado testeImovelUsado = (ImovelUsado) imovel;
			testeImovelUsado.imprimirDados();
		}
	}
}
