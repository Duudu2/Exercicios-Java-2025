package exercicio4oo.testes;

import exercicio4oo.classes.Retangulo;

public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo RetangulO = new Retangulo();
        RetangulO.setAltura(10.0);
        RetangulO.setLargura(5.0);


        System.out.printf("\n--- Dimensões do Retângulo ---");
        System.out.printf("\nLargura: " + RetangulO.getLargura());
        System.out.printf("\nAltura: " + RetangulO.getAltura());
        System.out.printf("\nÁrea...: %.2f ", RetangulO.calcularArea());
    }
}
