package exercicio4oo.testes;

import exercicio4oo.classes.Livro;

public class TesteLivro {
    public static void main(String[] args) {
        Livro LivrO = new Livro();
        LivrO.setAutor("J.R.R Tolkien");
        LivrO.setTitulo("O Senhor dos Anéis");
        LivrO.setEmprestado(false);
        LivrO.setGenero("Fantasia");

        System.out.printf("\n--- Dados do Livro ---");
        System.out.printf("Título: " + LivrO.getTitulo());
        System.out.printf("Autor: " + LivrO.getAutor());
        System.out.printf("Gênero: " + LivrO.getGenero());
        System.out.printf("Está emprestado? " + LivrO.isEmprestado());
    }
}
