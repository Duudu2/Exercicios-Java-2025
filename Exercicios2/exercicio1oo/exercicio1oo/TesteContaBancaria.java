package exercicio1oo;

class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.numeroConta = "12345-6";
        conta1.titular = "Maria Souza";
        conta1.saldo = 1500.75;

        System.out.println("\n--- Dados da Conta Bancária ---");
        System.out.println("Número da Conta: " + conta1.numeroConta);
        System.out.println("Titular: " + conta1.titular);
        System.out.println("Saldo: R$ " + conta1.saldo);
    }
}
