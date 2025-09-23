package exercicio4oo.testes;

import exercicio4oo.classes.Retangulo;

public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo RetangulO = new Retangulo();
        RetangulO.setAltura(10.5);
        RetangulO.setLargura(5.2);


        System.out.printf("\n--- Dimensões do Retângulo ---");
        System.out.printf("Largura: " + RetangulO.getLargura());
        System.out.printf("Altura: " + RetangulO.getAltura());
    }
}
