package Aula03.Exemplo02;

public class Galinha {
    
    String nome;
    Integer quantidadedeOvos = 0;
    static Integer quantidadedeOvosdaGranja = 0;

    public void botar(){

        quantidadedeOvos++;
        quantidadedeOvosdaGranja++;
    }
}
