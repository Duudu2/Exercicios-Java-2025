package exercicio1oo;

class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo();
        retangulo1.largura = 10.5;
        retangulo1.altura = 5.2;

        System.out.println("\n--- Dimensões do Retângulo ---");
        System.out.println("Largura: " + retangulo1.largura);
        System.out.println("Altura: " + retangulo1.altura);
    }
}
