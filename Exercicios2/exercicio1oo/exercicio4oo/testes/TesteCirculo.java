package exercicio4oo.testes;

import exercicio4oo.classes.Circulo;

public class TesteCirculo {
    public static void main(String[] args) {
        Circulo Circulo = new Circulo();
        Circulo.setRaio(6);


        System.out.printf("\n--- Dimensões do Círculo ---");
        System.out.printf("Raio: " + Circulo.getRaio());
    }
}