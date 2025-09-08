package exercicio1oo;

class TesteCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Onix";
        carro1.marca = "Chevrolet";
        carro1.ano = 2023;
        carro1.velocidade = 0.0;

        System.out.println("\n--- Dados do Carro ---");
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Ano: " + carro1.ano);
        System.out.println("Velocidade Atual: " + carro1.velocidade + " km/h");
    }
}
