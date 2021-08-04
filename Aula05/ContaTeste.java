package Aula05;

public class ContaTeste {
    public static void main (String[] args ){

        Conta conta1 = new Conta(1111,"João da Silva");

        conta1.imprimirSaldo();

        conta1.realizarDeposito(100);
        conta1.imprimirSaldo();
        
        conta1.efetuarSaque(50);
        conta1.imprimirSaldo();
    
        System.out.println(conta1.getNumero());
        System.out.println(conta1.getNomeTitular());
        System.out.println(conta1.getSaldo());

        conta1.setNomeTitular("Carlos o foda");
        
    }
}
