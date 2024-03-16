import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a distância total percorrida (em km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite a quantidade de combustível consumida (em litros): ");
        double combustivel = scanner.nextDouble();

        double consumoMedio = distancia / combustivel;

        System.out.println("O consumo médio de combustível é: " + consumoMedio + " km/h");

        scanner.close();
    }
}