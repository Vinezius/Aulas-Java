package Aula03;

public class Carro {
    
    String modelo;
    String marca;
    int ano;
    String placa;
    String cor;
        
    public void ligar() {	
        System.out.println(modelo +" O carro está ligando.");

        }
        
    public void desligar() {
        System.out.println(modelo + ": O carro está desligando");
        }

    public void acelerar() {
        System.out.println(modelo + ": vrum vrum.");

        }

    public void frear(){
        System.out.println(modelo +": O carro está freando.");

    }
    public String toString(){
        return "Modelo: " + modelo + " / Marca: "+ marca + " / Ano: " + ano + " / Placa: "+ placa + " / Cor: " + cor;
    }

}