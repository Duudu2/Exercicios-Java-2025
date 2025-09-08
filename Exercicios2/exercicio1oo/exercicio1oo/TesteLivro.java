package exercicio1oo;

class TesteLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "O Senhor dos Anéis";
        livro1.autor = "J.R.R. Tolkien";
        livro1.genero = "Fantasia";
        livro1.emprestado = false;

        System.out.println("\n--- Dados do Livro ---");
        System.out.println("Título: " + livro1.titulo);
        System.out.println("Autor: " + livro1.autor);
        System.out.println("Gênero: " + livro1.genero);
        System.out.println("Está emprestado? " + livro1.emprestado);
    }
}