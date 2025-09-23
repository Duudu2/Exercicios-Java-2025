package exercicio4oo.testes;

import exercicio4oo.classes.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro Carro = new Carro();
        Carro.setModelo("Onix");
        Carro.setAno(2008);
        Carro.setMarca("Chevrolet");
        Carro.setVelocidade(80);

        System.out.printf("\n--- Dados do Carro ---");
        System.out.printf("Modelo: " + Carro.getModelo());
        System.out.printf("Marca: " + Carro.getMarca());
        System.out.printf("Ano: " + Carro.getAno());
        System.out.printf("Velocidade Atual: " + Carro.getVelocidade() + " km/h");
    }
}