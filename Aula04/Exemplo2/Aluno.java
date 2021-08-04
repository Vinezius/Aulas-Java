package Aula04.Exemplo2;

public class Aluno {
    
    int ra;
    String nome;
    String curso;
    int periodo;

    
    public Aluno(){
        this(1000,"João","ADS",1);
    }
    
    public Aluno(int ra, String nome){

        this(ra, nome,"ADS",1);
       
    }
    
    public Aluno(int ra, int periodo){

        this(ra,"Camile","Engenharia",periodo);

    }
    
    
        public Aluno(String nome, String curso){
           
            this(1000,nome,curso,1);
        }

    public Aluno (int ra, String nome, String curso, int periodo) {

        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.periodo = periodo;
    }

        public String toString() {

            return "Aluno[ra= " + ra + ", nome= " + nome + ", curso=" + curso + ", periodo= " + periodo+"]";
        }
        
    }
