package Aula03;

public class Pessoa {
    String nome;
    Integer idade;
    Double peso;

    public void andar(){
        System.out.println(nome + " está andando.");
    }

    public void correr(){
        System.out.println(nome+ " está correndo.");
    }

    public void falar() {
        System.out.println(nome+ " está falando.");

    }
    public String toString(){
        return"Nome: "+nome+" idade: "+idade+" peso: " +peso+" kg";
    }
 
}
