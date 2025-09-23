package exercicio4oo.testes;

import exercicio4oo.classes.ContaBancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria ContaB = new ContaBancaria();
        ContaB.setSaldo(500);
        ContaB.setNumeroConta("Numero 3");
        ContaB.setTitular("Eduardo Mateus");

        System.out.printf("\n--- Dados da Conta Bancária ---");
        System.out.printf("\nNúmero da Conta: " + ContaB.getNumeroConta());
        System.out.printf("\nTitular: " + ContaB.getTitular());
        System.out.printf("\nSaldo: R$ " + ContaB.getSaldo());

        ContaB.depositar(300);
        ContaB.imprimirSaldoAtual();
    }
}
