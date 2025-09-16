package exercicio2oo.testes;

import exercicio2oo.classes.Circulo;

public class TesteCirculo {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        circulo1.raio = 7.0;

        System.out.println("\n--- Dimensões do Círculo ---");
        System.out.println("Raio: " + circulo1.raio);
    }
}