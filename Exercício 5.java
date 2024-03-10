import java.util.Scanner;

public class App {

    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em dólar: ");

        double valorEmDolar = scanner.nextDouble();

        double cotacaoDolarReal = 4.95;

        double valorEmReais = valorEmDolar * cotacaoDolarReal;

        System.out.println("\nValor em reais: R$ " + valorEmReais);

        scanner.close();
    }
}