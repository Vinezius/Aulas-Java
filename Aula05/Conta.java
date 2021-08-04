package Aula05;

public class Conta {
    
    private int numero;
    private String nomeTitular;
    private double saldo;


    public Conta(int numero, String nomeTitular){
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.00;
    }

    public void imprimirSaldo() {

        System.out.println("Numero da conta: " + this.numero);
        System.out.println("Nome do titular: " + this.nomeTitular);
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("=====================");
    }

    public void efetuarSaque(double valor) {

        if(this.saldo - valor < 0.0){
            System.out.println("saldo insuficiente");        
            System.out.println("=====================");
    }
    else {
            this.saldo-=valor;
            System.out.println("Saque realizado com sucesso.");
            System.out.println("=====================");
        }
    
    }

    public void realizarDeposito(double valor) {

        this.saldo+=valor;
        System.out.println("deposito realizado com sucesso.");
        this.calcularJuros();
        System.out.println("=====================");
        
    }

    private void calcularJuros(){

        this.saldo*=1.10;
    }

    public int getNumero() {

        return this.numero;
    
    } 

    public String getNomeTitular() {

        return this.nomeTitular;
    }

    public double getSaldo() {
        
        return this.saldo;
    }

    public void setNomeTitular(String nomeTitular) {
        if(!nomeTitular.equals("")){
        this.nomeTitular = nomeTitular;
        }
    }
}
