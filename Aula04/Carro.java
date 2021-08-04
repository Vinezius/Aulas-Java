package Aula04;

public class Carro {
    
    String modelo;
    String marca;
    int ano;
    String placa;
    String cor;
    boolean ligado;
    int velocidade;
    final int VELOCIDADE_MAXIMA;

    public Carro(String modelo, String marca, int ano, String placa, String cor){
        this.modelo = modelo;
        this.marca = marca;
        this.ano=ano;
        this.placa = placa;
        this.cor = cor;
        ligado = false;
        velocidade = 0; 
        this. VELOCIDADE_MAXIMA = 250;
    }
        
    public void ligar() {	
        
        this.ligado=true;
        System.out.println(modelo +" Está ligando.");
        }
        
    public void desligar() {
        this.ligado=false;
        System.out.println(modelo + " Está desligando");
    
    }

    public void acelerar(int velocidade) {
       
        if(this.ligado){
            
            this.velocidade += velocidade;

            if(this.velocidade > this.VELOCIDADE_MAXIMA){

                this.velocidade = this.VELOCIDADE_MAXIMA;

            }

        }   else {

            System.out.println(modelo + " encontra-se desligado.");
        
        }
        
        System.out.println(modelo + ": está acelerando.");
        
        
    }

    public void frear(int velocidade) {
        
        if(this.ligado){
            
            this.velocidade -= velocidade;
        }

        System.out.println(modelo +": O carro está freando.");

    }

    public String toString(){
       
        return "Modelo: " + modelo + " / Marca: "+ marca + " / Ano: " + ano + " / Placa: "+ placa + " / Cor: " + cor +" / ligado: "+ligado+" / velocidade: "+velocidade;
    
    }

}