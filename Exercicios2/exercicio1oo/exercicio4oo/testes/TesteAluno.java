package exercicio4oo.testes;

import exercicio4oo.classes.Aluno;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno Eduardo = new Aluno();
        Eduardo.setMatricula("CESMO - 16");
        Eduardo.setNome("Eduardo Mateus");
        Eduardo.setIdade(22);
        Eduardo.setNota1(10);
        Eduardo.setNota2(8);
        Eduardo.setNota3(7);
        Eduardo.setNota4(6);

        System.out.println("Média: " +
                Eduardo.calcularMedia());

        System.out.printf("--- Dados do Aluno ---");
        System.out.printf("Matrícula: " + Eduardo.getMatricula());
        System.out.printf("Nome: " + Eduardo.getNome());
        System.out.printf("Idade: " + Eduardo.getIdade());
        System.out.printf("Notas: " + Eduardo.getNota1());
        System.out.printf("Notas: " + Eduardo.getNota2());
        System.out.printf("Notas: " + Eduardo.getNota3());
        System.out.printf("Notas: " + Eduardo.getNota4());
    }
}
