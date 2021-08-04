package Aula04.Exemplo2;

public class AlunoTeste {
    public static void main(String[] args){

        Aluno aluno1 = new Aluno(1234, "Pedro", "ADS",2);
        Aluno aluno2 = new Aluno(5555, "Marcos");
        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno("Carlos", "BCC");
        Aluno aluno5 = new Aluno(1324,2);

        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
        System.out.println(aluno4);
        System.out.println(aluno5);
    }
}
