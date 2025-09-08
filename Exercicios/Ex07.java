import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor por hora: R$ ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite as horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salario = valorHora * horasTrabalhadas;
        System.out.printf("Salário do mês: R$ %.2f\n", salario);

        scanner.close();
    }
}
