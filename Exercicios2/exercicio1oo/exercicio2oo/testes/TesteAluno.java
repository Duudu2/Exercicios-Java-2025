package exercicio2oo.testes;

import exercicio2oo.classes.Aluno;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.matricula = "202501001";
        aluno1.nome = "João da Silva";
        // ... (o resto do código de teste permanece o mesmo)
        System.out.println("--- Dados do Aluno ---");
        System.out.println("Matrícula: " + aluno1.matricula);
        System.out.println("Nome: " + aluno1.nome);
    }
}
