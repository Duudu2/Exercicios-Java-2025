import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de anos que fuma: ");
        int anos = scanner.nextInt();

        System.out.print("Digite o número de cigarros por dia: ");
        int cigarrosPorDia = scanner.nextInt();

        System.out.print("Digite o preço de uma carteira: R$ ");
        double precoCarteira = scanner.nextDouble();

        // Cálculos
        int totalDias = anos * 365;
        int totalCigarros = totalDias * cigarrosPorDia;
        int totalCarteiras = (int) Math.ceil(totalCigarros / 20.0);
        double totalGasto = totalCarteiras * precoCarteira;

        System.out.printf("\nTotal gasto em %d anos: R$ %.2f\n", anos, totalGasto);
        System.out.println("Total de cigarros fumados: " + totalCigarros);
        System.out.println("Total de carteiras consumidas: " + totalCarteiras);

        scanner.close();
    }
}
