import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println(nome + " - Não pode votar!");
        } else {
            System.out.println(nome + " - Apto a votar!");
        }

        scanner.close();
    }
}