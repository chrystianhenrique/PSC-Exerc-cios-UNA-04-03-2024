import java.util.Scanner;

public class CalculoAreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * raio * raio;

        String areaFormadata = String.format("%.2f", area);

        System.out.println("A área do círculo com raio " + raio + " é: " + areaFormadata);

        scanner.close();
    }
}
