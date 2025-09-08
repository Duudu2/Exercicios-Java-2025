import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o sexo (M/F): ");
        char sexo = scanner.next().charAt(0);

        if (sexo == 'M' || sexo == 'm') {
            System.out.println("Sexo: Masculino");
        } else if (sexo == 'F' || sexo == 'f') {
            System.out.println("Sexo: Feminino");
        } else {
            System.out.println("Sexo inválido!");
        }

        scanner.close();
    }
}
