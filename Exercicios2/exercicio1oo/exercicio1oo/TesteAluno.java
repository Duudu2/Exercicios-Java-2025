package exercicio1oo;

class TesteAluno {
    public static void main(String[] args) {
        // Instanciando um objeto da classe Aluno
        Aluno aluno1 = new Aluno();

        // Atribuindo valores aos atributos
        aluno1.matricula = "202501001";
        aluno1.nome = "João da Silva";
        aluno1.idade = 20;
        aluno1.nota1 = 8;
        aluno1.nota2 = 7;
        aluno1.nota3 = 9;
        aluno1.nota4 = 10;

        // Exibindo os valores para teste
        System.out.println("--- Dados do Aluno ---");
        System.out.println("Matrícula: " + aluno1.matricula);
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Idade: " + aluno1.idade);
        System.out.println("Notas: " + aluno1.nota1 + ", " + aluno1.nota2 + ", " + aluno1.nota3 + ", " + aluno1.nota4);
    }
}