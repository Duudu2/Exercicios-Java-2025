import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância percorrida (km): ");
        int distancia = scanner.nextInt();

        System.out.print("Digite o combustível gasto (litros): ");
        double combustivel = scanner.nextDouble();

        double consumo = distancia / combustivel;
        System.out.printf("Consumo médio: %.2f km/l\n", consumo);

        scanner.close();
    }
}
